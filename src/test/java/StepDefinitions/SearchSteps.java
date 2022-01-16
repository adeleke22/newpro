package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		System.out.println("Inside Step - I am on the homepage");
	}

	@When("I see the welcome message")
	public void i_see_the_welcome_message() {
		System.out.println("Inside Step - I see the welcome message");
	}

	@And("I click on the search box")
	public void i_click_on_the_search_box() {
		System.out.println("Inside Step - I click on the search box");
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		System.out.println("Inside Step - I should be logged in");
	}

}


