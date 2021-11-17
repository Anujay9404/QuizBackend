package com.example.Quiz.entities;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String text;
	String choices[];
	int CorrectAns;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String[] getChoices() {
		return choices;
	}
	public void setChoices(String[] choices) {
		this.choices = choices;
	}
	public int getCorrectAns() {
		return CorrectAns;
	}
	public void setCorrectAns(int correctAns) {
		CorrectAns = correctAns;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", text=" + text + ", choices=" + Arrays.toString(choices) + ", CorrectAns="
				+ CorrectAns + "]";
	}
	
	
	
}
