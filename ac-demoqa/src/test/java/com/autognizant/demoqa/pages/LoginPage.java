package com.autognizant.demoqa.pages;

import org.testng.Assert;

import com.autognizant.core.config.CoreConfig;
import com.autognizant.core.selenium.AutognizantDriver;

public class LoginPage {

	private AutognizantDriver driver;
	
	public LoginPage(AutognizantDriver driver) {
		this.driver = driver;
	}
	
	public void launchApp() {
		driver.openBrowser(CoreConfig.getApplicationURL());
	}
	
	public void verifyLoginPageIsDisplayed() {
		driver.elementWait.waitUntilElementIsClickable("UserName TextBox");
		Assert.assertEquals(driver.getElementText("Login in Book Store Text"),"Login in Book Store", "Login in Book Store Text is not displayed");
		Assert.assertTrue(driver.isElementDisplayed("UserName TextBox"), "UserName TextBox is not displayed");
		Assert.assertTrue(driver.isElementDisplayed("Password TextBox"), "Password TextBox is not displayed");
	}
	
	public void login(String userName, String password) throws Exception {
		driver.enterText("UserName TextBox", userName);
		driver.enterText("Password TextBox", password);
		driver.clickElement("Login Button");
	}
	
	public void verifyErrorMessage(String message) {
		Assert.assertEquals(driver.getElementText("Login Error Message Text"), message,message +" is not displayed");
	}
}
