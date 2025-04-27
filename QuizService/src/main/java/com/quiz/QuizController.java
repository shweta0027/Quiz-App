package com.quiz;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	//@Autowired
	private QuizServiceee q;

	public QuizController(QuizServiceee q) {
		this.q = q;
	}
	
	//create
	@PostMapping("/")
	public Quiz create(@RequestBody Quiz quiz)
	{
		return q.add(quiz);
	}
	
	//get all
	@GetMapping("/")
	public List<Quiz> get(){
		return q.getalll();
	}
	
	@GetMapping("/{id}")
	public Quiz getOne(@PathVariable Long id){
		return q.get(id);
	}
}
