package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
	public void logo(WebDriver driver) {
		
		 WebElement i1 = driver.findElement
			      (By.xpath("//*[@id=\"ctl00_imglogo\"]"));
			      // Javascript executor to check image
			      Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i1);

			      //verify if status is true
			      if (p) {
			         System.out.println("Logo present");
			      } else {
			         System.out.println("Logo not present");
			      }
		
	}
}
