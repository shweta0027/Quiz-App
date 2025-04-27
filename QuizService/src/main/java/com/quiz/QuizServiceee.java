package com.quiz;

import java.util.List;

public interface QuizServiceee {

	Quiz add(Quiz quiz);
	List<Quiz> getalll();
	Quiz get(Long id);
}
