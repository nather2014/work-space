package com.example.questionbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.questionbank.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {

}
