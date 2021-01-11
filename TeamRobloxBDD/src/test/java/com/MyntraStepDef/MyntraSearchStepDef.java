package com.MyntraStepDef;

import com.MyntraPageActions.MyntraSearchBoxAction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyntraSearchStepDef {
	
	MyntraSearchBoxAction action = new MyntraSearchBoxAction();

	@Given("Customer lands on Myntra homepage < https:\\/\\/www.myntra.com\\/>")
	public void customer_lands_on_Myntra_homepage_https_www_myntra_com() {
		action.getMyntraHomepage();
		action.verifyHomepage();

	}

	@When("Customer search {string} items in the search box")
	public void customer_search_items_in_the_search_box(String item) {
		action.SearchTshirt(item);

	}

	@When("Customer press enter or click search icon")
	public void customer_press_enter_or_click_search_icon() throws InterruptedException {
		action.PressEnterBtn();

	}

	@Then("Customer should able to see searched items successfully")
	public void customer_should_able_to_see_searched_items_successfully() {

		action.verifySearchPage();

	}

}
