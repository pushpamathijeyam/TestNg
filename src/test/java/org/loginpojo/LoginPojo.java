package org.loginpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath="//input[@type='email']")
//	private WebElement userName;
//	@FindBy(xpath="//span[text()='Next']")
//	private WebElement clickBtn;
//	public WebElement getUserName() {
//		return userName;
//	}
//	public WebElement getClickBtn() {
//		return clickBtn;
//	}
//	
	
	
	
	
	

	@FindBy(id="email")
	private WebElement txtEmail;
	@FindBy(id="pass")
	private WebElement txtpass;
	@FindBy(name = "login")
	private WebElement btnLogin;
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}	public WebElement getBtnLogin() {
		return btnLogin;
}

}
