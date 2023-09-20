package org.sample;

import java.time.Duration;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestListic {
	WebDriver driver;

	@BeforeSuite
	private void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

	}

	@Test
	private void dynamicWebTable() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dyntable = driver.findElement(By.id("customers"));
		List<WebElement> alrow = dyntable.findElements(By.tagName("tr"));
		int columnIndex = 2;
		for (WebElement row : alrow) {
			String columnvalue = "";
			List<WebElement> cell = row.findElements(By.tagName("td"));
			if (cell.size() > columnIndex) {
				for (WebElement da : cell) {

					columnvalue = cell.get(columnIndex).getText();
					// System.out.println(columnvalue);
				}
			}

			if (columnvalue.contains("Canada")) {
				System.out.println("canada is there");

			} else {
				System.out.println("canada is not there");
			}
		}
	}

}
