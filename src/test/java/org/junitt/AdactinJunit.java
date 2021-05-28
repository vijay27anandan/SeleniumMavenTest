package org.junitt;

import java.awt.AWTException;
import java.io.IOException;
import org.base.LibGlobal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pom.LocatorsOfAdactin;

public class AdactinJunit extends LibGlobal{

	@BeforeClass
	public static void beforeClass() {
		LibGlobal global = new LibGlobal();
		global.getChromeDriver();
		global.launchUrl("https://adactinhotelapp.com/", 20);
	}
	
	@AfterClass
	public static void afterClass() throws InterruptedException {
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
	public void tc1() {
		LibGlobal global = new LibGlobal();
		LocatorsOfAdactin adactin = new LocatorsOfAdactin();
		global.enterDataInTextBox(adactin.getTxtUsername(), "ivijayanandan");
		global.enterDataInTextBox(adactin.getTxtPassword(), "9790183014");
		global.btnClick(adactin.getBtnLoginSubmit());
	}
	
	@Test
	public void tc2() throws AWTException {
		LibGlobal global = new LibGlobal();
		LocatorsOfAdactin adactin = new LocatorsOfAdactin();
		selectDDByVisibleText(adactin.getLocationDD(), "Brisbane");
		global.selectDDByVisibleText(adactin.getHotelDD(), "Hotel Sunshine");
		global.selectDDByVisibleText(adactin.getRoomType(), "Super Deluxe");
		global.selectDDByVisibleText(adactin.getRoomNos(), "4 - Four");
		adactin.getInDate().click();
		global.selectAll();
		global.enterDataInTextBox(adactin.getInDate(), "15/05/2021");
		adactin.getOutDate().click();
		global.selectAll();
		global.enterDataInTextBox(adactin.getOutDate(), "17/05/2021");
		global.selectDDByVisibleText(adactin.getAdultsCount(), "4 - Four");
		global.selectDDByVisibleText(adactin.getChildrenCount(), "4 - Four");
		global.btnClick(adactin.getBtnDetailsSubmit());
	}
	
	@Test
	public void tc3() {
		LibGlobal global = new LibGlobal();
		LocatorsOfAdactin adactin = new LocatorsOfAdactin();
		global.btnClick(adactin.getRadioBtn());
		global.btnClick(adactin.getContinueBtn());
	}
	
	@Test
	public void tc4() {
		LibGlobal global = new LibGlobal();
		LocatorsOfAdactin adactin = new LocatorsOfAdactin();
		global.enterDataInTextBox(adactin.getFrstName(), "Vijay");
		global.enterDataInTextBox(adactin.getLastName(), "anandan");
		global.enterDataInTextBox(adactin.getAddress(), "pallikaranai");
		global.enterDataInTextBox(adactin.getCcNum(), "5555444466667777");
		global.selectDDByVisibleText(adactin.getCcType(), "VISA");
		global.selectDDByVisibleText(adactin.getCcExpMonth(), "December");
		global.selectDDByVisibleText(adactin.getCcExpYear(), "2022");
		global.enterDataInTextBox(adactin.getCcCvv(), "117");
		global.btnClick(adactin.getBtnBookNow());
	}
}
