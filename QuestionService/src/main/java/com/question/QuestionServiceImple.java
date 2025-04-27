package com.question;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImple implements QuestionServicee{

	private QuestionRepo repo;
	
	public QuestionServiceImple(QuestionRepo repo) {
		this.repo = repo;
	}

	@Override
	public Question create(Question question) {
		// TODO Auto-generated method stub
		return repo.save(question);
	}

	@Override
	public List<Question> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Question getOne(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(()-> new RuntimeException("question not found"));
	}
	
	@Override
	public List<Question> getQuestionOfQuiz(Long quizId)
	{
		return repo.findByQuizId(quizId);
	}

}
