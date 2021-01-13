package com.MyntraStepDef;

import com.MyntraPageActions.MyntraHomeAndLivingAction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyntraHomeAndLivingStepDef {
	
	MyntraHomeAndLivingAction homeAndLivingAction = new MyntraHomeAndLivingAction ();

	@Given("Customer lands on Myntra homepage < \"https:\\/\\/www.myntra.com\\/\">")
	public void customer_lands_on_Myntra_homepage_https_www_myntra_com() {
		homeAndLivingAction.getMyntraHomePage();
		homeAndLivingAction.verifyMyntraHomePage();

	}
	
	@When("Customer mouse over the Home&Living")
	public void customer_mouse_over_the_Home_Living() {
		
		homeAndLivingAction.navigateToHomeAndLivingMenue();

	}

	@When("Customer click on Bedsheet")
	public void customer_click_on_Bedsheet() {
		
		homeAndLivingAction.navigateToBedSheets();

	}

	@When("Customer click on women")
	public void customer_click_on_women() throws InterruptedException {
		
		homeAndLivingAction.ClickWomenBtn();

	}

	@Then("Customer should able to land on women bedsheet page successfully")
	public void customer_should_able_to_land_on_women_bedsheet_page_successfully() throws InterruptedException {
		
		homeAndLivingAction.verifyWomenBedsheetPage();

	}

}
