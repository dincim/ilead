package com.ilead.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ilead.qa.base.TestBase;
import com.ilead.qa.pages.DoSurveyInEn;


public class DoSurveyInEnTest extends TestBase {
	
	DoSurveyInEn doSurveyEn;
	
	public DoSurveyInEnTest(){
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {

		initialization();
		doSurveyEn = new DoSurveyInEn();
	}
	
	@Test
	public void surveyInEnTest() throws InterruptedException {
		
		doSurveyEn.doSurveyEnglish();
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
