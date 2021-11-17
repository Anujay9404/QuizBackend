package com.example.Quiz.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Option {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	int questionId;
	String name;
	boolean isAnswer;
	boolean selected;
	@Override
	public String toString() {
		return "Option [id=" + id + ", questionId=" + questionId + ", name=" + name + ", isAnswer=" + isAnswer
				+ ", selected=" + selected + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAnswer() {
		return isAnswer;
	}
	public void setAnswer(boolean isAnswer) {
		this.isAnswer = isAnswer;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
