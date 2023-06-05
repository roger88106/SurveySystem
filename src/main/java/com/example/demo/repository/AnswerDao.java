package com.example.demo.repository;

import com.example.demo.entity.Answer;
import com.example.demo.entity.id.AnswerId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerDao extends JpaRepository<Answer, AnswerId> {
}
