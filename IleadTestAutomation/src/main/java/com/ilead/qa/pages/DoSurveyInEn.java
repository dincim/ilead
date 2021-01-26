package com.ilead.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ilead.qa.base.TestBase;

public class DoSurveyInEn extends TestBase {

	// Page Factory-- OR

	@FindBy(id = "surveyCode")
	WebElement surveyCode;

	@FindBy(xpath = "//input[@placeholder='Enter your email']")
	WebElement email;

//	@FindBy(xpath = "")
//	WebElement fullName;
//	
//	@FindBy(xpath = "")
//	WebElement phoneNum;

	@FindBy(xpath = "//*[@class = 'recaptcha-checkbox-border']")
	WebElement captchaCheck;

	@FindBy(xpath = "//*[contains(text(),'Submit')]")
	WebElement clickSubmit;

	public DoSurveyInEn() {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, 30);

	public void doSurveyEnglish() throws InterruptedException {

		surveyCode.sendKeys("389e6f7a-0eb");
		
		Thread.sleep(3000);
		
		JavascriptExecutor executor0 = (JavascriptExecutor) driver;
		executor0.executeScript("arguments[0].click();",email );
		 
        //wait.until(ExpectedConditions.visibilityOf(email));
             

		email.sendKeys("dincim@hotmail.com");
		
		Thread.sleep(3000);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", captchaCheck);

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", clickSubmit);

	}

}
