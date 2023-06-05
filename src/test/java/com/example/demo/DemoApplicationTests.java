package com.example.demo;

import com.example.demo.repository.AnswerDao;
import com.example.demo.repository.QuestionDao;
import com.example.demo.repository.RespondentDao;
import com.example.demo.repository.SurveyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	AnswerDao answerDao;
	@Autowired
	QuestionDao questionDao;
	@Autowired
	RespondentDao respondentDao;
	@Autowired
	SurveyDao surveyDao;

	@Test
	void answerDaoTest() {
		answerDao.findAll();
	}
	@Test
	void questionDao() {
		questionDao.findAll();
	}
	@Test
	void respondentDaoTest() {
		respondentDao.findAll();
	}
	@Test
	void surveyDaoTest() {
		surveyDao.findAll();
	}

}
