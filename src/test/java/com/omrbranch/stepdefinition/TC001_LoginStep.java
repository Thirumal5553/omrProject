package com.omrbranch.stepdefinition;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pageobject.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;



public class TC001_LoginStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();
	
	
	@Given("User is on the OMR Branch hotel page")
	public void userIsOnTheOMRBranchHotelPage() throws FileNotFoundException, IOException {
		browserLaunch(getPropertyFileValue("browser"));
		enterApplUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicitWait();
	}
	@When("User login {string} and {string}")
	public void userLoginAnd(String emailId, String password) {
		pom.getLoginpage().login(emailId, password);
	    
	}
	
	@Then("User should verify success message after login {string}")
	public void userShouldVerifySuccessMessageAfterLogin(String expLoginSucessMassageText) {
		String actLoginSucessMassageText = pom.getSearchHotelPage().getLoginSucessMassageText();
		Assert.assertEquals("Verify after login success message", expLoginSucessMassageText,actLoginSucessMassageText);
		
	}
	
	@When("User login {string} and {string} with enter key")
	public void userLoginAndWithEnterKey(String emailId, String password) {
		pom.getLoginpage().loginwithEnterkey(emailId, password);
	   
	}

	@Then("User should verify error message after login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String expLoginErrorMassageText) {
		String actLoginErrorMassageText = pom.getLoginpage().getLoginErrorMessageText();
		boolean b = actLoginErrorMassageText.contains(expLoginErrorMassageText);
		Assert.assertTrue("Verifi after login error massage",b);
	   
	}
}
