package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "respondents")
public class Respondent {

    @Id
    @Column(name = "id")
    private Integer respondentId;
    @Column(name = "surveys_id")
    private Integer surveysId;
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "age")
    private String age;
    @Column(name = "response_time")
    private LocalDateTime responseTime;

    public Respondent() {
    }

    public Respondent(Integer respondentId, Integer surveysId, String name, String phone, String email, String age, LocalDateTime responseTime) {
        this.respondentId = respondentId;
        this.surveysId = surveysId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.responseTime = responseTime;
    }

    public Integer getRespondentId() {
        return respondentId;
    }

    public void setRespondentId(Integer respondentId) {
        this.respondentId = respondentId;
    }

    public Integer getSurveysId() {
        return surveysId;
    }

    public void setSurveysId(Integer surveysId) {
        this.surveysId = surveysId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public LocalDateTime getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(LocalDateTime responseTime) {
        this.responseTime = responseTime;
    }
}
