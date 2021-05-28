package org.adactin;

import java.awt.AWTException;
import java.io.IOException;
import org.base.LibGlobal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pom.LocatorsOfAdactin;

public class AdactinFromExcel extends LibGlobal{

	@BeforeClass
	public static void beforeClassMethod() {
		LibGlobal global = new LibGlobal();
		global.getChromeDriver();
		global.launchUrl("https://adactinhotelapp.com/", 20);
	}
	
	@AfterClass
	public static void afterClassMethod() throws InterruptedException {
		LibGlobal global = new LibGlobal();
		global.waitandClose();
	}
	@Before
	public void beforeMethod() {
		LibGlobal global = new LibGlobal();
		global.printDate();
	}
	@After
	public void afterMethod() throws IOException {
		LibGlobal global = new LibGlobal();
		global.screenshotAndTime("adactin");
	}
	@Test
	public void exec1() throws IOException, AWTException {
		LibGlobal global = new LibGlobal();
		LocatorsOfAdactin l = new LocatorsOfAdactin();
		for (int i = 1; i <= 1; i++) {
			for (int j = 0; j <1; j++) {
				WebElement txtUsername2 = l.getTxtUsername();
				enterDataInTextBox(txtUsername2, getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				WebElement txtPassword2 = l.getTxtPassword();
				enterDataInTextBox(txtPassword2, getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				btnClick(l.getBtnLoginSubmit());
				selectDDByVisibleText(l.getLocationDD(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				selectDDByVisibleText(l.getHotelDD(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				selectDDByVisibleText(l.getRoomType(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				selectDDByVisibleText(l.getRoomNos(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				l.getInDate().click();
				selectAll();
				enterDataInTextBox(l.getInDate(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				l.getOutDate().click();
				selectAll();
				enterDataInTextBox(l.getOutDate(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				selectDDByVisibleText(l.getAdultsCount(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				selectDDByVisibleText(l.getChildrenCount(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				btnClick(l.getBtnDetailsSubmit());
				btnClick(l.getRadioBtn());
				btnClick(l.getContinueBtn());
				enterDataInTextBox(l.getFrstName(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				enterDataInTextBox(l.getLastName(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				enterDataInTextBox(l.getAddress(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				enterDataInTextBox(l.getCcNum(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				selectDDByVisibleText(l.getCcType(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				selectDDByVisibleText(l.getCcExpMonth(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				selectDDByVisibleText(l.getCcExpYear(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				enterDataInTextBox(l.getCcCvv(), getValueFromExcel("C:\\Users\\vijay\\eclipse-workspace\\SeleniumMavenTest\\New folder\\Adactin.xlsx", "Details", i, j));
				j++;
				btnClick(l.getBtnBookNow());
			}
		}
		
		
	}
	



}
