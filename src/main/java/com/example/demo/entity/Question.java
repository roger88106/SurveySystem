package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @Column(name = "id")
    private Integer questionId;
    @Column(name = "surveys_id")
    private Integer surveysId;
    @Column(name = "question")
    private String question;
    @Column(name = "options")
    private String options;
    @Column(name = "type")
    private Integer type;
    @Column(name = "mandatory")
    private boolean mandatory;

    public Question() {
    }

    public Question(Integer questionId, Integer surveysId, String question, String options, Integer type, boolean mandatory) {
        this.questionId = questionId;
        this.surveysId = surveysId;
        this.question = question;
        this.options = options;
        this.type = type;
        this.mandatory = mandatory;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getSurveysId() {
        return surveysId;
    }

    public void setSurveysId(Integer surveysId) {
        this.surveysId = surveysId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }
}
