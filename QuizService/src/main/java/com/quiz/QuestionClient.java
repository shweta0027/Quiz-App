package com.quiz;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url="http://localhost:8082", value = "Question-Client")
@FeignClient(name="QUESTIONSERVICE") //load balancing, service might run on any port
public interface QuestionClient {
	
	  @GetMapping("/question/quiz/{quizId}")
      List<Question> getQuestionOfQuiz(@PathVariable Long quizId);
      
}
