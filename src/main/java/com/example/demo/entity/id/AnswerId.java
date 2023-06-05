package com.example.demo.entity.id;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class AnswerId implements Serializable {
    @Id
    @Column(name = "respondent_id")
    private Integer respondentId;
    @Id
    @Column(name = "question_id")
    private Integer questionId;

    public AnswerId() {
    }

    public AnswerId(Integer respondentId, Integer questionId) {
        this.respondentId = respondentId;
        this.questionId = questionId;
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
}
