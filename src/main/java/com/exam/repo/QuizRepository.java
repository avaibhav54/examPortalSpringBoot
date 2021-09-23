package com.exam.repo;

import com.exam.model.exams.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Long>{

}
