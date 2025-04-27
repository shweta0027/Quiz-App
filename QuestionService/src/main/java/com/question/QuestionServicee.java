package com.question;

import java.util.List;

public interface QuestionServicee {

	Question create(Question question);
	List<Question> getall();
	Question getOne(Long id);
	List<Question> getQuestionOfQuiz(Long quizId);
}
