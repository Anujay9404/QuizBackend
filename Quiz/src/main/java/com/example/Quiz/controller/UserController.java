package com.example.Quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Quiz.entities.User;


@CrossOrigin
@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public void login(@RequestParam(value = "email", required = false) String email, @RequestParam(value = "password", required = false) String password,@RequestBody User user) {
		System.out.println(email);
		System.out.println(password);
		userRepository.save(user);
	}
}
