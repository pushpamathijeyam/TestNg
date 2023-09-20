package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FaceBook extends BaseClass{
	public static void main(String[] args) throws IOException {
		openEdgeBrowser();
		maxWindow();
		lanuchUrl("https://www.facebook.com/");
		WebElement txtemail = driver.findElement(By.id("email"));
		fillTextBox(txtemail, readDataFromExcel("adactin", 2, 0));
	finEle();
	
	}

}
