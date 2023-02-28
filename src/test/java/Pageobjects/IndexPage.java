package Pageobjects;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Baseclass;


	public  class IndexPage {
		
		
		
		public void openlogin(WebDriver driver) throws Exception {
			driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div[1]/div/div[3]/ul/li[1]/a/span[2]/img")).click();
			driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignIn_txtEmail\"]")).sendKeys("8297314733");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignIn_txtPassword\"]")).sendKeys("jaya@123");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignIn_btnLogin\"]")).click();
		}
		}
		

		
		