package org.sample;

import java.util.Date;

import org.loginpojo.LoginPojo;
import org.loginpojo.MailPojo;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MailSample extends BaseClass{
	@BeforeClass
	private void beforeAllTc() {
		openEdgeBrowser();
		
		maxWindow();

	}

	@BeforeMethod
	private void beforeDate() {
		lanuchUrl("https://www.gmail.com");
		Date d = new Date();
		System.out.println(d);
	}


	@Test
	private void loginDetails(){
		MailPojo m =new MailPojo();
		WebElement userName = m.getUserName();
		fillTextBox(userName, "apushpamathi@gmail.com");
		WebElement clickBtn = m.getClickBtn();
		clickBtn.click();

	}

	@AfterMethod
	private void afterDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass
	private void titleget() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

}



