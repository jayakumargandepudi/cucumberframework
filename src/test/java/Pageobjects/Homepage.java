package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;
import junit.framework.Assert;


	public class Homepage extends Baseclass{

		public Homepage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//span[@class='text-white accountred']//img[@alt='Account Icon']")
		WebElement Accocnticon;
		@FindBy(partialLinkText="Log")
		WebElement Loginbutton;
		@FindBy(xpath="//input[@id='ctl00_phBody_SignIn_txtEmail']")
		WebElement usernametextbox;
		@FindBy(xpath="//input[@id='ctl00_phBody_SignIn_txtPassword']")
		WebElement passwordtextbox;
		@FindBy(xpath="//a[@id='ctl00_phBody_SignIn_btnLogin']")
		WebElement buttonlogin;
		@FindBy(xpath="//a[normalize-space()='My Account']")
		WebElement myaccountlink;
		@FindBy(xpath="//a[normalize-space()='Request a Book']")
		WebElement requestbookdropdown;
		public void verifyusericonTextfield() {
			Accocnticon.click();
			Actions action = new Actions(driver);
			action.moveToElement(Loginbutton).click().perform();
		}
		public void verifyUserName() {
			usernametextbox.sendKeys("8297314733");
			passwordtextbox.sendKeys("jaya@123");
			buttonlogin.click();
			
		}
		public void verifymyAccountLinkpresentonHomepage() {
			boolean acc=myaccountlink.isEnabled();
			System.out.println(acc);
			Assert.assertTrue("is not displayed", acc);
		}
		public void verifylastdropdown() {
			boolean reuest = requestbookdropdown.isEnabled();
			System.out.println(reuest);
			Assert.assertTrue("is not displayed", reuest);
		}
		public void closebrowser() {
			driver.close();
		}
	}
			



