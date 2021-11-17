package com.example.Quiz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

//import static org.mockito.Mockito.verify;
//import java.sql.SQLException;
//import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Quiz.controller.QuestionRepository;
import com.example.Quiz.controller.QuizRepository;
import com.example.Quiz.controller.UserRepository;
import com.example.Quiz.entities.Question;
import com.example.Quiz.entities.Quiz;
import com.example.Quiz.entities.User;






@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class QuizApplicationTests {
	
//	private UserController userservice;
//	private QiuzController quizCon;
	
	private static final int user_Id = 11;
	private static final int quiz_Id = 53;
	@Autowired
	UserRepository userRepos;
	
	@Autowired
	QuizRepository quizRepos;
	
	@Autowired
	QuestionRepository quesRepos;
	
//	@Mock
//	UserRepository repos;
	
	@Mock
	QuizRepository repos;

	@Test
	public void TestCreateAUser() {
		
		User user1 = new User();user1.setId(53);
		user1.setId(54);
		user1.setEmail("raju@123");
		user1.setPassword("raju123");
		userRepos.save(user1);
		assertNotNull(userRepos.findById(54).get());
		
	}
	
	@Test
	 
	public void TestReadUsers() {
		List<User> list = userRepos.findAll();
//		assertThat(list).size().isGreaterThan(0);
         System.out.println(list);
		
		assertSame(31,userRepos.findAll().size());
	}
	@Test
	
	public void TestSingleUser() {
		User user1 = userRepos.findById(54).get();
		assertEquals("raju@123",user1.getEmail());
	}
	
	@Test
	
	public void TestReadQuiz() {
		List<Quiz> list = quizRepos.findAll();
        System.out.println(list);
        System.out.println(list.size());
		
		assertSame(4,quizRepos.findAll().size());
		
	}
	
	@Test
	
	public void TestSingleQuiz() {
		Quiz quiz1 = quizRepos.findById(2).get();
		Question que1 = quesRepos.findById(3).get();
		assertEquals("Java quiz",quiz1.getName());
		assertEquals("The loop keyword of java is?",que1.getText());
		String[] ch1 = {"asv", "ertf", "bbh"};  
		assertEquals(ch1,que1.getChoices());
		assertEquals(0,que1.getCorrectAns());
		
	}
	
   @Test
   
   public void TestdeleteUser() {
	   
	    userRepos.deleteById(12);
	   assertThat(userRepos.existsById(12)).isFalse();
	  
   }
   
   @Test
   
   public void TestdeleteQuiz() {
	   
	   quizRepos.deleteById(53);
	   assertThat(quizRepos.existsById(53)).isFalse();
   }
	
	
	}
	

	
	


