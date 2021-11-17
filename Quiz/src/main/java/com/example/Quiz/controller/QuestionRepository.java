package com.example.Quiz.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Quiz.entities.Question;


public interface QuestionRepository extends JpaRepository<Question,Integer> {

}
