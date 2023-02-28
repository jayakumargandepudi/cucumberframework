package Stepdefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Baseclass{
	 Scenario scn;
	@Before 
	public void launchapp() throws Exception {
		launch();
	}
	@Before
	public void scenarioSetup(Scenario s) {
		this.scn =s;
	}
	
	@AfterStep
	public void screenshot() {
		if (scn.isFailed()) {
			TakesScreenshot scrnshot = (TakesScreenshot) driver;
			byte[] data = scrnshot.getScreenshotAs(OutputType.BYTES);
			scn.attach(data, "image/png", "Failes scenario");
			
		} else {
			TakesScreenshot scrnshot = (TakesScreenshot) driver;
			byte[] data = scrnshot.getScreenshotAs(OutputType.BYTES);
			scn.attach(data, "image/png", "Passed scenario");
			
			
		}
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}


}
