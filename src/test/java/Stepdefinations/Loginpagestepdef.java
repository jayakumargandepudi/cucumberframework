package Stepdefinations;

import Pageobjects.Allpages;
import Pageobjects.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpagestepdef extends Allpages {
	@Given("User open the browser")
	public void user_should_be_on_the_loginpage() {
		Loginpage l1 = new Loginpage();
		l1.logo(driver);
		System.out.println("Here the logo is Original");
	    
	}
	@When("User should be on indexpage")
	public void user_should_on_homepage() {
	    
	}
	@Then("User should click on login button")
	public void verify_the_my_account_field_is_displayed() {
	    
	}
	@Then("User should be on loginpage")
	public void user_should_be_on_loginpage() {
	}
	
	}

	
	
	