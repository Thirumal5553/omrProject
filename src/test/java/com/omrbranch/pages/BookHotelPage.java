package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotelPage {
	
	@FindBy(xpath="//h2[contains(text(),'Book Hotel')]")
	private WebElement txtSuccessBookHotel;
	@FindBy(id="own")
	private WebElement rdoBookingFor;
	@FindBy(id="user_title")
	private WebElement ddnSalutation;
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	@FindBy(id="last_name")
	private WebElement txtLastName;
	@FindBy(id="phone")
	private WebElement txtPhoneNo;
	@FindBy(name="email")
	private WebElement txtEmail;
	@FindBy(id="gst")
	private WebElement chkGst;
	@FindBy(name="registration")
	private WebElement txtRegistrationNo;
	@FindBy(id="company_name")
	private WebElement txtCompanyName;
	@FindBy(id="company_address")
	private WebElement txtCompanyAddress;
	@FindBy(id="step1next")
	private WebElement btnNextStep;
	@FindBy(id="bed")
	private WebElement chkSpecialRequest;
	@FindBy(id="other_request")
	private WebElement txtSpecialRequest;
	@FindBy(id="step2next")
	private WebElement btnNextStep2;
	@FindBy(xpath="//h5[contains(text(),'Credit/Debit/ATM Card')]")
	private WebElement btnPayment;
	@FindBy(id="payment_type")
	private WebElement ddnPaymentType;
	@FindBy(id="card_type")
	private WebElement ddnCardType;
	@FindBy(id="card_no")
	private WebElement txtCardNo;
	@FindBy(id="card_name")
	private WebElement txtCardName;
	@FindBy(id="card_month")
	private WebElement ddnMonth;
	@FindBy(id="card_year")
	private WebElement ddnYear;
	@FindBy(id="cvv")
	private WebElement txtCVV;
	@FindBy(id="submitBtn")
	private WebElement btnSubmit;
	public WebElement getTxtSuccessBookHotel() {
		return txtSuccessBookHotel;
	}
	public WebElement getRdoBookingFor() {
		return rdoBookingFor;
	}
	public WebElement getDdnSalutation() {
		return ddnSalutation;
	}
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtPhoneNo() {
		return txtPhoneNo;
	}
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getChkGst() {
		return chkGst;
	}
	public WebElement getTxtRegistrationNo() {
		return txtRegistrationNo;
	}
	public WebElement getTxtCompanyName() {
		return txtCompanyName;
	}
	public WebElement getTxtCompanyAddress() {
		return txtCompanyAddress;
	}
	public WebElement getBtnNextStep() {
		return btnNextStep;
	}
	public WebElement getChkSpecialRequest() {
		return chkSpecialRequest;
	}
	public WebElement getTxtSpecialRequest() {
		return txtSpecialRequest;
	}
	public WebElement getBtnNextStep2() {
		return btnNextStep2;
	}
	public WebElement getBtnPayment() {
		return btnPayment;
	}
	public WebElement getDdnPaymentType() {
		return ddnPaymentType;
	}
	public WebElement getDdnCardType() {
		return ddnCardType;
	}
	public WebElement getTxtCardNo() {
		return txtCardNo;
	}
	public WebElement getTxtCardName() {
		return txtCardName;
	}
	public WebElement getDdnMonth() {
		return ddnMonth;
	}
	public WebElement getDdnYear() {
		return ddnYear;
	}
	public WebElement getTxtCVV() {
		return txtCVV;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	

}



