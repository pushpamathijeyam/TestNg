package org.loginpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class MailPojo extends BaseClass {
	public MailPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='email']")
	private WebElement userName;
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement clickBtn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getClickBtn() {
		return clickBtn;
	
	}
}
