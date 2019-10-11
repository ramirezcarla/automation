package AutomationFramework.stepDefs;

import AutomationFramework.utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends DriverFactory {

	@Given("^User navigates to GitLab website$")
	public void user_navigates_to_GitLab_website() throws Throwable {

	}

	@And("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {

	}

	@And("^User enters an invalid password$")
	public void user_enters_an_invalid_password() throws Throwable {

	}

	@And("^User enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {

	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {

	}

	@Then("^User should be taken to login screen$")
	public void user_should_be_taken_to_login_screen() throws Throwable {

	}

	@Then("^User should see login failure message$")
	public void user_should_see_login_failure_message() throws Throwable {
	}
}