package com.MyntraStepDef;

import static org.testng.Assert.fail;

import com.MyntraPageActions.MyntraLoginAction;

import io.cucumber.java.en.*;

public class MyntraLoginStepDef {

	MyntraLoginAction loginAction = new MyntraLoginAction();

	@Given("Customer launch in Myntra home page < https:\\/\\/www.myntra.com\\/>")
	public void customer_launch_in_Myntra_home_page_https_www_myntra_com() {

		loginAction.getMyntraHomePage();
		loginAction.verifyMyntraHomePage();

	}

	@When("Customer mousehover to profile")
	public void customer_mousehover_to_profile() {

		loginAction.navigateToProfileMenu();

	}

	@When("Customer clicks on loginorSignup")
	public void customer_clicks_on_loginorSignup() {

		loginAction.navigateToLoginorSignup();

	}

	@When("Customer put correct phonenumber {string}")
	public void customer_put_correct_phonenumber(String phonenumber) {

		loginAction.inputPhoneNumber(phonenumber);

	}

	@When("Customer clicks on continue Btn")
	public void customer_clicks_on_continue_Btn() {

		loginAction.continueBtn();

	}

	@When("Customer clicks on password Btn")
	public void customer_clicks_on_password_Btn() {

		loginAction.clickPasswordBtn();

	}

	@When("Customer put correct password {string}")
	public void customer_put_correct_password(String password) {

		loginAction.inputPassword(password);

	}

	@When("Customer clicks on LogIn button")
	public void customer_clicks_on_LogIn_button() {

		loginAction.clickLoginBtn();

	}

	@Then("Customer should be able to land on login page")
	public void customer_should_be_able_to_land_on_login_page() {

		loginAction.verifyLoginPage();

	}

	@When("Customer put correct Phonenumber {string}")
	public void customer_put_correct_Phonenumber(String phonenumber) {

		loginAction.inputPhoneNumber(phonenumber);

	}

	@When("Customer put wrong password {string}")
	public void customer_put_wrong_password(String password) {

		loginAction.inputPassword(password);

	}
	/*
	 * @Then("Customer should receive an error message") public void
	 * customer_should_receive_an_error_message() {
	 * 
	 * 
	 * if (loginAction.loginErrorMsg().contains("Incorrect")) {
	 * System.out.println("Error Message Test: PASSED"); } else {
	 * System.out.println("Error Message Test: FAILED"); fail();
	 * 
	 * }
	 */

}
