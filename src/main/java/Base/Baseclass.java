package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static Properties prop;
	public static WebDriver driver;
	public static String browserName;
	   //LoadCongigration file
    //Browser Setup

    public void loadConfig(){
    	try {
    		
    	String path ="C:\\Users\\gandepudi.jayakumar\\eclipse-workspace\\Cucumberdemo2\\Configurations";
        FileInputStream fis = new FileInputStream(path);
   prop =new  Properties();
  prop.load(fis);
  
} catch (FileNotFoundException e) {
    	e.printStackTrace();
}catch(IOException e) {
	e.printStackTrace();
}
}

 

@SuppressWarnings("deprecation")
public static WebDriver launch() {
	 WebDriverManager.chromedriver().setup();
	 browserName = "chrome";
	 
	 if (browserName.contains("chrome")) {
		 driver=new ChromeDriver();
		 
	 }else if(browserName.contains("firefox")) {
		 driver=new FirefoxDriver();
		 
	 }else if(browserName.contains("IE")) {
		 driver=new InternetExplorerDriver();
	 }
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 driver.get("https://www.bookswagon.com/");
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	return driver;
	 
	 
	 

 }
}



