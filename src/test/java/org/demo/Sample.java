package org.demo;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample extends BaseClass {
	@Test
	private void mynthra() throws InterruptedException, IOException {
		openChromeBrowser();
		driver.get("https://www.myntra.com");
		WebElement searchBtn = driver.findElement(By.className("desktop-searchBar"));
		searchBtn.sendKeys("watches");
		takeScreenShot("img");
		driver.findElement(By.className("desktop-submit")).click();
		takeScreenShot("imgname1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'imageSliderContainer')][1]")).click();
		takeScreenShot("imgname2");
		Set<String> allwindow = driver.getWindowHandles();
		List<String> li = new LinkedList<String>();
		li.addAll(allwindow);
		driver.switchTo().window(li.get(1));
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		takeScreenShot("imgname3");
		driver.findElement(By.xpath("//span[text()='Bag']")).click();
		takeScreenShot("imgname4");
		String text = driver.findElement(By.className("priceDetail-base-total")).getText();
		//String text = driver
			//	.findElement(
				//		By.xpath("//*[@class='priceDetail-base-total']//child::span[@class='priceDetail-base-value ']"))
				//.getText();

		System.out.println(text);

	}
	
}
