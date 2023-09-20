package org.sample;

import java.util.Date;

import org.loginpojo.LoginPojo;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class TestngDay1 extends BaseClass {
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


	@Test(dataProvider="course", dataProviderClass=DataCollection.class)
	private void login(String s1, String s2) throws InterruptedException {
		LoginPojo l = new LoginPojo();
		//Thread.sleep(2000);
//		WebElement txtemail = l.getTxtEmail();
//		fillTextBox(txtemail, s1);
//		WebElement txtpwd = l.getTxtpass();
//		fillTextBox(txtpwd, s2);
//		WebElement loginbtn = l.getBtnLogin();
//		loginbtn.click();
//		Thread.sleep(2000);
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
