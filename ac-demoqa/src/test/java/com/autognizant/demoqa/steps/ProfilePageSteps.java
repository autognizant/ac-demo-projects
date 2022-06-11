package com.autognizant.demoqa.steps;

import com.autognizant.core.cucumber.TestContext;
import com.autognizant.demoqa.pages.ProfilePage;

import io.cucumber.java.en.Then;

public class ProfilePageSteps {

	private TestContext testContext;
	private ProfilePage profilePage;
	
	public ProfilePageSteps(TestContext context) {
		this.testContext = context;
		profilePage = new ProfilePage(testContext.getDriverManager().getAutognizantDriver());
	}
	
	@Then("I verify that the profile page is displayed")
	public void i_verift_that_the_profile_page_is_displayed() {
		profilePage.verifyProfilePageIsDisplayed();
	}
}
