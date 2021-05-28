package org.pom;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorsOfAdactin extends LibGlobal {
	public LocatorsOfAdactin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement txtUsername;

	@FindAll({ @FindBy(xpath = "//input[@name='password']"), @FindBy(xpath = "//input[@id='password']") })
	private WebElement txtPassword;

	@FindBy(xpath = "//input[@class='login_button']")
	private WebElement btnLoginSubmit;

	@FindBy(xpath = "//select[@id='location']")
	private WebElement locationDD;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotelDD;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomType;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement roomNos;

	@FindBy(xpath = ("//input[@id='datepick_in']"))
	private WebElement inDate;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement outDate;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultsCount;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childrenCount;
	
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement btnDetailsSubmit;

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radioBtn;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueBtn;

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement frstName;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastName;

	@FindBy(xpath = "//td//textarea[@id='address']")
	private WebElement address;

	@FindBy(xpath = "//td//input[@id='cc_num']")
	private WebElement ccNum;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement ccType;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement ccExpMonth;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement ccExpYear;

	@FindBy(xpath = "//td//input[@id='cc_cvv']")
	private WebElement ccCvv;

	@FindBy(xpath = "//td//input[@id='book_now']")
	private WebElement btnBookNow;

	@FindBy(xpath = "//td//input[@id='logout']")
	private WebElement btnLogout;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLoginSubmit() {
		return btnLoginSubmit;
	}

	public WebElement getLocationDD() {
		return locationDD;
	}

	public WebElement getHotelDD() {
		return hotelDD;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getInDate() {
		return inDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public WebElement getAdultsCount() {
		return adultsCount;
	}

	public WebElement getChildrenCount() {
		return childrenCount;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getFrstName() {
		return frstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}

	public WebElement getCcCvv() {
		return ccCvv;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}
	
	public WebElement getBtnDetailsSubmit() {
		return btnDetailsSubmit;
	}

}
