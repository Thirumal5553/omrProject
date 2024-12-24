package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotelPage {
	@FindBy(xpath="//h5[contains(text(),'Select Hotel')]")
	private WebElement txtSuccessSelect;
	@FindBy (xpath="//div[@class='col-md-5 hotel-suites']/h5")
	private List<WebElement> listOfHotel;
	@FindBy(xpath="//div[@class='prize']/strong")
	private List<WebElement> listOfHotelPrice;
	@FindBy(xpath="//a[@class='btn filter_btn']")
	private List<WebElement> btnContinue;


}
