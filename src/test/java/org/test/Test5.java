package org.test;

import java.io.IOException;
import java.util.List;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test5 extends LibGlobal {
	public static void main(String[] args) throws IOException {
		LibGlobal global = new LibGlobal();
		global.getChromeDriver();
		global.launchUrl("https://www.amazon.in/", 20);

		WebElement txtSrch = driver.findElement(By.id("twotabsearchtextbox"));
		global.searchAndEnter(txtSrch, "iphone");

		global.filePath("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Test - Copy.xlsx");

		List<WebElement> prodName = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		List<WebElement> prodPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		global.createRowAndInsert("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Test - Copy.xlsx", "Amazon", prodName, 0);
		global.getRowAndInsert("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Test - Copy.xlsx", "Amazon", prodPrice, 1);
		
	}
}
