package com.question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question, Long>{

	List<Question> findByQuizId(Long quizId);
}
