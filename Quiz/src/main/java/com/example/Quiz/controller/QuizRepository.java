package com.example.Quiz.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Quiz.entities.Quiz;


public interface QuizRepository extends JpaRepository<Quiz,Integer> {

	 List<Quiz> findByName(String name);
}
