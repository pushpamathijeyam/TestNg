package org.sample;

import java.io.IOException;
import java.util.Date;

import org.loginpojo.LoginPojo;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftSample extends BaseClass {
	SoftAssert s;
	LoginPojo l;

	@BeforeClass
	private void beforeAllTc() {
		openChromeBrowser();
		maxWindow();
	}

	@BeforeMethod
	private void beforeDateAndTime() {
		lanuchUrl("https://www.facebook.com/");
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	private void loginDetails() throws IOException {
		l = new LoginPojo();
		s = new SoftAssert();
		WebElement txtEmail = l.getTxtEmail();
		fillTextBox(txtEmail, "ammu");
		s.assertEquals(txtEmail.getAttribute("value"), readDataFromExcel("adactin", 1, 0), "check username");
		WebElement txtpass = l.getTxtpass();
		fillTextBox(txtpass, readDataFromExcel("adactin", 1, 1));
		WebElement btnLogin = l.getBtnLogin();
		toClickButton(btnLogin);
		s.assertAll();
	}

	@AfterMethod
	private void afterDateAndTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void afterAllTc() {
		s = new SoftAssert();
		s.assertAll();
	}

}
