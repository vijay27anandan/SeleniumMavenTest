package org.adactin;

import java.awt.AWTException;
import java.io.IOException;
import org.base.LibGlobal;
import org.openqa.selenium.WebDriver;
import org.pom.LocatorsOfAdactin;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinUsingTestNg extends LibGlobal{
	WebDriver driver;
	LibGlobal global;
	@BeforeClass
	private void runDriver() {
		global = new LibGlobal();
		global.getChromeDriver();
	}
	
	@AfterClass
	private void closeAndExit() throws InterruptedException {
		global.waitandClose();
	}
	
	@BeforeMethod
	private void dateAndTime() {
		global.printDate();
	}
	
	@AfterMethod
	private void screenshotAndDate() throws IOException {
		global.screenshotAndTime("ad");
	}
	
	@Parameters({"URL", "waittime","Username","Password"})
	@Test(priority=-1)
	private void launchAndLogin(String s, int s1,String s2,String s3) {
		global.launchUrl(s, s1);
		LocatorsOfAdactin l = new LocatorsOfAdactin();
		global.enterDataInTextBox(l.getTxtUsername(), s2);
		global.enterDataInTextBox(l.getTxtPassword(), s3);
		global.btnClick(l.getBtnLoginSubmit());
	}
	
	@Parameters({"Location","Hotel","Room Type","Room No","In Date","Out Date","Adults","Children"})
	@Test(priority=0)
	private void details(String Loc, String Hotl, String RT, String RN,String ID,String OD,String ADL, String Child) throws AWTException {
		LocatorsOfAdactin l = new LocatorsOfAdactin();
		selectDDByVisibleText(l.getLocationDD(), Loc);
		selectDDByVisibleText(l.getHotelDD(), Hotl);
		selectDDByVisibleText(l.getRoomType(), RT);
		selectDDByVisibleText(l.getRoomNos(), RN);
		global.btnClick(l.getInDate());
		selectAll();
		enterDataInTextBox(l.getInDate(), ID);
		global.btnClick(l.getOutDate());
		selectAll();
		enterDataInTextBox(l.getOutDate(), OD);
		selectDDByVisibleText(l.getAdultsCount(), ADL);
		selectDDByVisibleText(l.getChildrenCount(), Child);
		btnClick(l.getBtnDetailsSubmit());
	}
	
	@Test(priority=1)
	private void reviewAndContinue() {
		LocatorsOfAdactin l = new LocatorsOfAdactin();
		btnClick(l.getRadioBtn());
		btnClick(l.getContinueBtn());
	}
	
	@Parameters({"Fname","Lname","Address","CCNum","CCType","CCExpMon","CCExpYear","CCCvv"})
	@Test(priority=2)
	private void paymentAndPersonalDetails(String FN, String LN, String Ad, String CCNm, String CCtype, String CCExM, String CCExpY, String CCCvv ) {
		LocatorsOfAdactin l = new LocatorsOfAdactin();
		enterDataInTextBox(l.getFrstName(), FN);
		enterDataInTextBox(l.getLastName(), LN);
		enterDataInTextBox(l.getAddress(), Ad);
		enterDataInTextBox(l.getCcNum(), CCNm);
		selectDDByVisibleText(l.getCcType(), CCtype);
		selectDDByVisibleText(l.getCcExpMonth(), CCExM);
		selectDDByVisibleText(l.getCcExpYear(), CCExpY);
		enterDataInTextBox(l.getCcCvv(), CCCvv);
		btnClick(l.getBtnBookNow());
	}
	
	
	
}
