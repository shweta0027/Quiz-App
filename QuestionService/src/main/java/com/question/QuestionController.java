package com.question;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/question")
public class QuestionController {

	private QuestionServicee service;

	public QuestionController(QuestionServicee service) {
		this.service = service;
	}
	
	//create
	@PostMapping("/")
	public Question create(@RequestBody Question question)
	{
		return service.create(question);
	}
	
	//get all
		@GetMapping("/")
		public List<Question> get(){
			return service.getall();
		}
		
		//get one
		@GetMapping("/{questionId}")
		public Question getOne(@PathVariable Long questionId){
			return service.getOne(questionId);
		}
		
		//get all question of specific quiz
		@GetMapping("/quiz/{quizId}")
		public List<Question> getQuestionOfQuiz(@PathVariable Long quizId){
			return service.getQuestionOfQuiz(quizId);
		}
}
