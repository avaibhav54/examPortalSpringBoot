package com.exam.repo;

import com.exam.model.exams.Category;
import com.exam.model.exams.Quiz;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Long>{

	public List<Quiz> findByCategory(Category cat);

	

}
