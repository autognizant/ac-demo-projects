package com.autognizant.demoqa.pages;

import org.testng.Assert;

import com.autognizant.core.selenium.AutognizantDriver;

public class ProfilePage {

	private AutognizantDriver driver;
	
	public ProfilePage(AutognizantDriver driver) {
		this.driver = driver;
	}
	
	public void verifyProfilePageIsDisplayed() {
		driver.elementWait.waitUntilElementIsClickable("Search TextBox");
		Assert.assertTrue(driver.isElementDisplayed("Search TextBox"), "Search TextBox is not displayed");
		Assert.assertTrue(driver.isElementDisplayed("Logout Button"), "Logout Button is not displayed");
	}
}
