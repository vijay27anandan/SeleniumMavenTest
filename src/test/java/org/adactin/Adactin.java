package org.adactin;

import java.awt.AWTException;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.pom.LocatorsOfAdactin;

public class Adactin extends LibGlobal{
	public static void main(String[] args) throws AWTException {
		LibGlobal global = new LibGlobal();
		global.getChromeDriver();
		global.launchUrl("https://adactinhotelapp.com/", 20);
		
		LocatorsOfAdactin l = new LocatorsOfAdactin();
		WebElement txtUsername2 = l.getTxtUsername();
		global.enterDataInTextBox(txtUsername2, "ivijayanandan");
		WebElement txtPassword2 = l.getTxtPassword();
		global.enterDataInTextBox(txtPassword2, "9790183014");
		l.getBtnLoginSubmit().click();
		global.selectDDByVisibleText(l.getLocationDD(), "Adelaide");
		global.selectDDByVisibleText(l.getHotelDD(), "Hotel Hervey");
		global.selectDDByVisibleText(l.getRoomType(), "Deluxe");
		global.selectDDByVisibleText(l.getRoomNos(), "4 - Four");
		l.getInDate().click();
		global.selectAll();
		global.enterDataInTextBox(l.getInDate(), "15/05/2021");
		l.getOutDate().click();
		global.selectAll();
		global.enterDataInTextBox(l.getOutDate(), "18/05/2021");
		global.selectDDByVisibleText(l.getAdultsCount(), "4 - Four");
		global.selectDDByVisibleText(l.getChildrenCount(), "0 - None");
		global.btnClick(l.getBtnDetailsSubmit());
		global.btnClick(l.getRadioBtn());
		global.btnClick(l.getContinueBtn());
		global.enterDataInTextBox(l.getFrstName(), "vijay");
		global.enterDataInTextBox(l.getLastName(), "anandan");
		global.enterDataInTextBox(l.getAddress(), "pallikaranai");
		global.enterDataInTextBox(l.getCcNum(), "5555444488889999");
		global.selectDDByVisibleText(l.getCcType(), "VISA");
		global.selectDDByVisibleText(l.getCcExpMonth(), "June");
		global.selectDDByVisibleText(l.getCcExpYear(), "2022");
		global.enterDataInTextBox(l.getCcCvv(), "111");
		global.btnClick(l.getBtnBookNow());
	}

}
