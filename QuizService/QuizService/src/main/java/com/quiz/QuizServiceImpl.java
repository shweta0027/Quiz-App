package com.quiz;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceImpl implements QuizServiceee{

	//@Autowired
	private QuizRepo repo;
	private QuestionClient qclient;
	
	public QuizServiceImpl(QuizRepo repo, QuestionClient qclient) {
		this.repo = repo;
		this.qclient = qclient;
	}

	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
		return repo.save(quiz);
	}

	@Override
	public List<Quiz> getalll() {
		// TODO Auto-generated method stub
		List<Quiz> quizzes = repo.findAll();
		
		List<Quiz> newquizlist = quizzes.stream().map(quiz-> {
			quiz.setQuestions(qclient.getQuestionOfQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		
		
				return newquizlist;
	}

	@Override
	public Quiz get(Long id) {
		// TODO Auto-generated method stub
		Quiz quizz=repo.findById(id).orElseThrow(()-> new RuntimeException("quiz not found"));
		quizz.setQuestions(qclient.getQuestionOfQuiz(quizz.getId()));
		return quizz;
	}

}
