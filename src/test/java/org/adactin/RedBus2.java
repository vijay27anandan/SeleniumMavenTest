package org.adactin;

import java.util.List;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RedBus2 extends LibGlobal{
public static void main(String[] args) throws InterruptedException {
	LibGlobal global = new LibGlobal();
	
	global.getChromeDriver();
	global.launchUrl("https://www.redbus.in/", 20);
	
	WebElement dArr = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
	dArr.click();
	
	WebElement signLink = driver.findElement(By.xpath("//li[@id='signInLink']"));
	signLink.click();
	
	Thread.sleep(3000);
	
	List<WebElement> frameSize = driver.findElements(By.tagName("iframe"));
	int size = frameSize.size();
	System.out.println(size);
	WebElement frame = driver.findElement(By.xpath("(//iframe[@class='modalIframe'])"));
	driver.switchTo().frame(frame);
	
	WebElement login = driver.findElement(By.xpath("//div//input[@type='number']"));
	login.sendKeys("9876543210");
	
	driver.findElement(By.xpath("//span[text()='GENERATE OTP ']")).click();
	
	
}
}
