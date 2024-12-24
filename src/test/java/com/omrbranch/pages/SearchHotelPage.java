package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement textLoginSucessMassage;
	
	
	
	public WebElement getTextLoginSucessMassage() {
		return textLoginSucessMassage;
	}

	public WebElement getTextSuccessLoginMsg() {
		return textSuccessLoginMsg;
	}

	@FindBy(xpath = "//a[@class='icoTwitter mr-2 dropdown-toggle']")
	private WebElement textSuccessLoginMsg;
	
	@FindBy(xpath = "//img[@alt = 'hotel booking']")
	private WebElement selectHotelPage;
	
	@FindBy(id = "state")
	private WebElement ddnSelectState;
	
	@FindBy(id = "city")
	private WebElement ddnSelecCity;
	
	@FindBy(id = "room_type")
	private WebElement ddnSelectRoomType;
	
	@FindBy(name = "check_in")
	private WebElement txtCheckIn;
	
	@FindBy(name = "check_out")
	private WebElement txtCheckOut;
	
	@FindBy(id = "no_rooms")
	private WebElement ddnSelectNoOfRooms;
	
	@FindBy(id = "no_adults")
	private WebElement ddnSelectNoOfAdults;
	
	@FindBy(id = "no_child")
	private WebElement txtNoOfChild;
	
	@FindBy(id = "hotelsearch_iframe")
	private WebElement frmOfSearchBtn;
	
	@FindBy(id = "searchBtn")
	private WebElement btnSearch;

	public WebElement getSelectHotelPage() {
		return selectHotelPage;
	}

	public WebElement getDdnSelectState() {
		return ddnSelectState;
	}

	public WebElement getDdnSelecCity() {
		return ddnSelecCity;
	}

	public WebElement getDdnSelectRoomType() {
		return ddnSelectRoomType;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getDdnSelectNoOfRooms() {
		return ddnSelectNoOfRooms;
	}

	public WebElement getDdnSelectNoOfAdults() {
		return ddnSelectNoOfAdults;
	}

	public WebElement getTxtNoOfChild() {
		return txtNoOfChild;
	}

	public WebElement getFrmOfSearchBtn() {
		return frmOfSearchBtn;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	
	public String getLoginSucessMassageText() {
		String elementGetText = elementGetText(textLoginSucessMassage);
		return elementGetText;

	}

	
	

}
