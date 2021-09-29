package com.exam.services;

import java.util.List;

import com.exam.model.User;
import com.exam.model.exams.Quiz;
import com.exam.model.exams.Result;

public interface ResultService {
	
	public Result addResult(Result result);
	public List<Result> getAllResult();
	public List<Result> getResultOfQuiz(Quiz quiz);
	public List<Result> getResultOfUser(User user);
	public List<Result> getResultOfUserAndQuiz(Quiz quiz,User user);

}
