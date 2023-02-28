package Stepdefinations;

import Pageobjects.Allpages;
import Pageobjects.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepagestepdef extends Allpages{
	Homepage homepage=new Homepage(driver);
	
	@Given("User should be on the loginpage")
	public void user_should_be_on_the_loginpage() {
		homepage.verifyusericonTextfield();
		System.out.println("executed");
	   
	}
	@When("User should on homepage")
	public void user_should_on_homepage() {
		homepage.verifyUserName();
	    
	}
	@Then("verify the myAccount field is displayed")
	public void verify_the_my_account_field_is_displayed() {
		homepage.verifymyAccountLinkpresentonHomepage();
	    
	}
	@Then("verify the requestCheckbook link field is displayed")
	public void verify_the_request_checkbook_link_field_is_displayed() {
		homepage.verifylastdropdown();
	    
	}
	@Then("click on the logout")
	public void click_on_the_logout() {
	    
	}




	}
	
	


	