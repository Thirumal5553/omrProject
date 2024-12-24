package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyBookingPage {
	
	@FindBy(xpath="//a[@data-testid='username']")
	private WebElement lnkWelcomeUser;
	@FindBy(xpath="//a[contains(text(),'My Account')]")
	private WebElement lnkMyAccount;
	@FindBy(name="search")
	private WebElement txtSearch;
	@FindBy(xpath="//h5[contains(text(),'Select Hotel')]")
	private WebElement txtOrderId;
	@FindBy(xpath="//a[@href='https://omrbranch.com/view-booking/YLYOJ20226']/child::h5"
			+ "")
	private WebElement txtHotelName;
	@FindBy(xpath="div[@class='my-booking  prize']/strong")
	private WebElement txtPrice;
	@FindBy(xpath="//button[@class='edit btn filter_btn']")
	private WebElement btnEdit;
	@FindBy(name="check_in")
	private WebElement updateDate;
	@FindBy(xpath="//button[contains(text(),'Confirm')]")
	private WebElement btnContinue;
	@FindBy(xpath="//li[contains(text(),'Booking updated successfully')]")
	private WebElement txtSuccessChangeBooking;
	@FindBy(xpath="//a[contains(text(),'Cancel')]")
	private WebElement btnCancel;
	@FindBy(xpath="//li[contains(text(),'Your booking cancelled successfully')]")
	private WebElement txtSuccessCancelBooking;
	public WebElement getLnkWelcomeUser() {
		return lnkWelcomeUser;
	}
	public WebElement getLnkMyAccount() {
		return lnkMyAccount;
	}
	public WebElement getTxtSearch() {
		return txtSearch;
	}
	public WebElement getTxtOrderId() {
		return txtOrderId;
	}
	public WebElement getTxtHotelName() {
		return txtHotelName;
	}
	public WebElement getTxtPrice() {
		return txtPrice;
	}
	public WebElement getBtnEdit() {
		return btnEdit;
	}
	public WebElement getUpdateDate() {
		return updateDate;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public WebElement getTxtSuccessChangeBooking() {
		return txtSuccessChangeBooking;
	}
	public WebElement getBtnCancel() {
		return btnCancel;
	}
	public WebElement getTxtSuccessCancelBooking() {
		return txtSuccessCancelBooking;
	}
	

}



