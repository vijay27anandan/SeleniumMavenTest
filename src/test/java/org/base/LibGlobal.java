package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	public static WebDriver driver;
	public static Actions ac;
	public static Robot rb;
	public static File file;
	public static Workbook workbook;

	// 1.to launch a chrome driver
	public void getChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	// 2.to launch a URL
	public void launchUrl(String Url, int waitSeconds) {
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(waitSeconds, TimeUnit.SECONDS);
	}

	// 3.to enter data in text box
	public void enterDataInTextBox(WebElement element, String data) {
		element.sendKeys(data);
	}

	// 4.to click a button
	public void btnClick(WebElement element) {
		element.click();
	}

	// 5.to right click and select option
	public void rightClickAndEnter(WebElement element, int i) throws AWTException {
		ac = new Actions(driver);
		ac.contextClick(element).perform();

		rb = new Robot();

		for (int j = 0; j < i; j++) {
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
		}

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

	// 6.Cut text from a textBox and paste the text in Target textbox
	public void cutPasteTxt(WebElement src, WebElement target) throws AWTException {
		ac = new Actions(driver);
		ac.doubleClick(src).perform();

		rb = new Robot();

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_X);

		rb.keyRelease(KeyEvent.VK_X);
		rb.keyRelease(KeyEvent.VK_CONTROL);

		target.click();

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
	}

	// 7.File Path
	public void filePath(String pathname) throws IOException {
		File file = new File(pathname);
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
	}

	// 8.To Create a sheet in Excel File
	public void createSheet(String sheetName) {
		workbook.createSheet(sheetName);
	}

	// 9.To get text from website
	public void getTextFromWeb(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	// 10.To search and Enter in search Box
	public void searchAndEnter(WebElement element, String text) {
		element.sendKeys(text, Keys.ENTER);
	}

	// 11.To create the row in excel and iterate the value from Webelement List and
	// insert in Mentioned column
	public void createRowAndInsert(String path, String sheetName, List<WebElement> elements, int cell_ind)
			throws IOException {
		File file = new File(path);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet Sheet = workbook.createSheet(sheetName);
		for (int i = 0; i < elements.size(); i++) {
			String text = elements.get(i).getText();
			Row createRow = Sheet.createRow(i);
			Cell createCell = createRow.createCell(cell_ind);
			createCell.setCellValue(text);
			System.out.println(text);
		}
		FileOutputStream stream2 = new FileOutputStream(file);
		workbook.write(stream2);
	}

	// 12.To select/get the row in excel and iterate the value from Webelement List
	// and insert in Mentioned column
	public void getRowAndInsert(String path, String sheetName, List<WebElement> elements, int cell_ind)
			throws IOException {
		File file = new File(path);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet Sheet = workbook.getSheet(sheetName);
		for (int j = 0; j < elements.size(); j++) {
			String price = elements.get(j).getText();
			Row createRow1 = Sheet.getRow(j);
			Cell createCell1 = createRow1.createCell(cell_ind);
			createCell1.setCellValue(price);
			System.out.println(price);
		}
		FileOutputStream stream2 = new FileOutputStream(file);
		workbook.write(stream2);
	}

	// 13.To print the values in excel
	public void fileOSStream() throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
	}

	// 14.To Select from dropdown by visibletext
	public void selectDDByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// 15.selectAll
	public void selectAll() throws AWTException {
		rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);
	}

	// 16.screenshot and time after execution
	public void screenshotAndTime(String screenshotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File(screenshotName+".PNG"));
		System.out.println(screenshotAs);
		Date date = new Date();
		System.out.println(date);
	}
	
	//17.close Method
	public void waitandClose() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
	
	//18.To printDate
	public void printDate() {
		Date date = new Date();
		System.out.println(date);
	}
	
	//19. To get the file from excel
	public String getValueFromExcel(String pathName, String sheetName,int rowNo, int cellNo) throws IOException {
		File file = new File(pathName);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		String Value;
		if (cellType==1) {
			 Value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Value = dateFormat.format(dateCellValue);
		} else{
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			Value = String.valueOf(l);
		}
		
		return Value;
	}
}





















