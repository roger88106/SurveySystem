package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "surveys")
public class Survey {

    @Id
    @Column(name = "id")
    private Integer surveyId;
    @Column(name = "name")
    private String surveyName;
    @Column(name = "description")
    private String surveyDescription;
    @Column(name = "start")
    private LocalDateTime startTime;
    @Column(name = "end")
    private LocalDateTime endTime;

    public Survey() {
    }

    public Survey(Integer surveyId, String surveyName, String surveyDescription, LocalDateTime startTime, LocalDateTime endTime) {
        this.surveyId = surveyId;
        this.surveyName = surveyName;
        this.surveyDescription = surveyDescription;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public String getSurveyDescription() {
        return surveyDescription;
    }

    public void setSurveyDescription(String surveyDescription) {
        this.surveyDescription = surveyDescription;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
