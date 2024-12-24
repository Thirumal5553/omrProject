package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmPage {
	@FindBy(id="booking-code")
	private WebElement txtSuccessBookingConfirmation;
	@FindBy(xpath="//strong[contains(text(),'Hilton')]")
	private WebElement txtHotelName;
	public WebElement getTxtSuccessBookingConfirmation() {
		return txtSuccessBookingConfirmation;
	}
	public WebElement getTxtHotelName() {
		return txtHotelName;
	}

}



