package Stepdefinations;

import Pageobjects.Allpages;
import Pageobjects.IndexPage;
import io.cucumber.java.en.Given;

public class Indexpagestepdef extends Allpages {
	@Given("User open the indexpage")
	public void user_open_the_indexpage() throws Exception {
		launch() ;
		IndexPage i1=new IndexPage();
		i1.openlogin(driver);
		System.out.println("the click botton is working");
		
		
	}
	@Given("User should be on Login")
	public void user_should_be_on_login() {
	  
	}

}

	 