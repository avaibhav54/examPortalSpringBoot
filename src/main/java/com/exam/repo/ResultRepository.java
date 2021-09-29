package com.exam.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.model.User;
import com.exam.model.exams.Quiz;
import com.exam.model.exams.Result;

public interface ResultRepository extends JpaRepository<Result, Integer> {

	List<Result> findByQuiz(Quiz quiz);

	List<Result> findByUser(User user);

	List<Result> findByQuizAndUser(Quiz quiz, User user);

}
