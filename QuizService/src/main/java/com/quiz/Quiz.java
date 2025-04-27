package com.quiz;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//eureka server used for registryservice
//load balancing=add dependency
//api gateway ->add api and eureka dependency and configure pom.xml

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Component
public class Quiz {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	private String title;
	
	transient private List<Question> questions; //wont get stored in database
	
	public Quiz()
	{
		
	}

	public Quiz(Long id, String title, List<Question> questions) {
		super();
		this.id = id;
		this.title = title;
		this.questions = questions;
	}

	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
}
