package com.example.demo.entity;

import com.example.demo.entity.id.AnswerId;

import javax.persistence.*;

@Entity
@Table(name = "answer")
@IdClass(AnswerId.class)
public class Answer {
    @Id
    @Column(name = "respondent_id")
    private Integer respondentId;
    @Id
    @Column(name = "question_id")
    private Integer questionId;
    @Column(name = "answer")
    private String answer;

    public Answer() {
    }

    public Answer(Integer respondentId, Integer questionId, String answer) {
        this.respondentId = respondentId;
        this.questionId = questionId;
        this.answer = answer;
    }

    public Integer getRespondentId() {
        return respondentId;
    }

    public void setRespondentId(Integer respondentId) {
        this.respondentId = respondentId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
