package com.quiz;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Component
public class Question {

	private Long questionId;
	private String question;
	private Long quizId;
	
	public Question()
	{
		
	}
	
	public Question(Long questionId, String question, Long quizId) {
		
		this.questionId = questionId;
		this.question = question;
		this.quizId=quizId;
	}
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public Long getQuizId() {
		return quizId;
	}

	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}

}
