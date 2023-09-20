package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;
import org.testng.xml.LaunchSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example extends BaseClass {

	@Test
	private void tc() throws InterruptedException {
		openEdgeBrowser();
		lanuchUrl("https://www.amazon.in/");
		maxWindow();
		// WebElement lang =
		// driver.findElement(By.xpath("//span[@class='icp-color-base']"));
		// moveCursor(lang);
		// Thread.sleep(2000);
		WebElement lang1 = driver.findElement(By.id("icp-nav-flyout"));

		moveCursor(lang1);
		List<WebElement> lan = driver.findElements(By
				.xpath("//div[@id=\"nav-flyout-icp\"]//div//a//span[@style=\"unicode-bidi:isolate; direction:ltr;\"]"));
	for (WebElement x : lan) {
		String text = x.getText();
		System.out.println(text);
		
	}

//		System.setProperty("webdriver.edge.driver",
//				"C:\\Users\\Akila\\eclipse-workspace\\SeleniumDemo\\driver\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		Thread.sleep(2000);
////		WebElement lang = driver.findElement(
//				By.xpath("(//div[contains(@class,'nav-template nav-flyout-content nav-tpl-itemList')])[3]"));
//String listlang = lang.getAttribute("value");
//System.out.println(listlang);
//		
//		driver.get("https://ironspider.ca/forms/dropdowns.htm");
//		WebElement opt = driver.findElement(By.name("coffee"));
//		Select s = new Select(opt);
//		List<WebElement> options = s.getOptions();
//		for (int i = 0; i < options.size(); i++) {
//			WebElement allelement = options.get(i);
//			String text = allelement.getText();
//			System.out.println(text);
//			
//		}
//		s.selectByIndex(2);
//		WebElement c1 =s.getFirstSelectedOption();
//		System.out.println(c1.getText());
//		
//		for (int i = 0; i < options.size(); i++) {
//			
//		
//		if(options.contains(c1))
//		{
//		
//			break;
//			
//		}
//		else
//		{
//			System.out.println(c1);
//		}
//		
//		}
//	}
//	

//		
//		

//			WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
//			search.sendKeys("mobile");
//			WebElement clk = driver.findElement(By.xpath("//input[@type='submit']"));
//			clk.click();
//	
//			List<WebElement> mobname = driver.findElements(By.className("a-size-medium a-color-base a-text-normal"));
//
//		System.out.println(mobname.size());

	}
}
