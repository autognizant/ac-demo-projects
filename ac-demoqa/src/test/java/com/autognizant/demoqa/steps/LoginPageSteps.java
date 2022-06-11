package com.autognizant.demoqa.steps;

import java.util.List;
import java.util.Map;

import com.autognizant.core.cucumber.TestContext;
import com.autognizant.demoqa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	private TestContext testContext;
	private LoginPage loginPage;
	
	public LoginPageSteps(TestContext context) {
		this.testContext = context;
		loginPage = new LoginPage(testContext.getDriverManager().getAutognizantDriver());
	}
	
	@Given("I am on login page")
	public void i_am_on_login_page() {
		loginPage.launchApp();
	}
	
	@When("I login with valid credentials")
	public void i_login_with_valid_credentials(io.cucumber.datatable.DataTable dataTable) throws Exception {
		List<Map<String, String>> data = dataTable.asMaps();
		System.out.println("User Name = " + data.get(0).get("UserName"));
		System.out.println("Password = " + data.get(0).get("Password"));
		loginPage.login(data.get(0).get("UserName"), data.get(0).get("Password"));
	}
	
	@Then("I verify that the {string} message is displayed")
	public void i_verift_that_the_message_is_displayed(String message) {
		loginPage.verifyErrorMessage(message);
	}
}
