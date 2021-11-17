package com.example.Quiz.controller;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Quiz.entities.Quiz;

@CrossOrigin
@RestController
public class QiuzController {

	@Autowired
	QuizRepository quizRepository;
	
	@Autowired
	QuestionRepository questionRepository;
	
	@ManyToMany(cascade=CascadeType.ALL)
//	@GetMapping("/byname/{name}")
	@RequestMapping(path="/byname/{name}",method= RequestMethod.GET)
	public List<Quiz> fetchQuizByQuizName(@PathVariable(value = "name") String name){
		System.out.println("by name method involked...");
		return quizRepository.findByName(name);
	}
	
	@RequestMapping(path="/quiz",method= RequestMethod.GET)
	public List<Quiz> Quizes(){
		System.out.println("quizes method involked...");
//		return null;
		return quizRepository.findAll();
	}
//	
//	@RequestMapping(path= "/quiz",method= RequestMethod.POST)
//	public void addQuiz(@RequestBody(required = false) Quiz quiz){
//		System.out.println("add quiz method involked...");
//		System.out.println(quiz);
//		//db insert
//		quizRepository.save(quiz);
//		
//	}
	
	@RequestMapping(path = "/quiz", method = RequestMethod.POST)
//	@PostMapping("/")
	public ResponseEntity<Void> addQuiz(@RequestBody Quiz quiz){
		System.out.println("add a quiz method is invoked...");
		System.out.println(quiz);
		// db insert
		quizRepository.save(quiz);
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.CREATED);
		return re;
	}
//	@RequestMapping(path = "/quiz/{id}", method = RequestMethod.DELETE)
////	@DeleteMapping("/{mentorid}")
//	public void deleteWorkout(@PathVariable(value = "id") int id){
//		System.out.println(id);
//		questionRepository.deleteById(id);
//	}
//	
//	,@RequestBody(required = false) Quiz quiz
	
	
	@RequestMapping(path = "/quiz/{id}", method = RequestMethod.DELETE)
//	@DeleteMapping("/{workoutid}")
	public ResponseEntity<Void> deleteQuiz(@PathVariable("id") int quizId){
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.OK);
		try {
			quizRepository.deleteById(quizId);
		}
		catch(EmptyResultDataAccessException e) {
			re= new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
		return re;
	}
}
