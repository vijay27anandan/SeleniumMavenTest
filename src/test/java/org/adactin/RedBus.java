package org.adactin;

import java.util.List;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RedBus extends LibGlobal{
public static void main(String[] args) {
	LibGlobal global = new LibGlobal();
	
	global.getChromeDriver();
	global.launchUrl("https://netbanking.hdfcbank.com/netbanking/", 20);
	
	List<WebElement> frameSize = driver.findElements(By.tagName("frame"));
	int size = frameSize.size();
	System.out.println(size);
	WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
	driver.switchTo().frame(frame);
	
	WebElement login = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	login.sendKeys("vijay");
	
}
}
