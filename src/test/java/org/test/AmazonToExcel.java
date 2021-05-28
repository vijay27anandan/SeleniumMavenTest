package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonToExcel {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement txtSrch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSrch.sendKeys("iphone", Keys.ENTER);

		File file = new File("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Test - Copy.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet Sheet = workbook.getSheet("Sheet2");

		List<WebElement> prodName = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		List<WebElement> prodPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		for (int i = 0; i < prodName.size(); i++) {
			String product = prodName.get(i).getText();
			Row createRow = Sheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(product);
			System.out.println(product);
		}


		for (int j = 0; j < prodPrice.size(); j++) {
			String price = prodPrice.get(j).getText();
			Row createRow1 = Sheet.getRow(j);
			Cell createCell1 = createRow1.createCell(1);
			createCell1.setCellValue(price);
			System.out.println(price);
		}

		FileOutputStream stream2 = new FileOutputStream(file);
		workbook.write(stream2);
	}
}
