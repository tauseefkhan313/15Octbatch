package com.saucedemo.TESTPACK;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POMPACK.LoginPOMClass;
import com.saucedemo.UtilityPACK.UtilityClass;

public class TestBaseClass 
{
WebDriver driver;

//TO MAINTAIN LOGS LIKE BANK STATEMENT WHICH IS CREATE BY DEV SIDE WE SET HERE LOG FILE
//loggerclass  refvar  log method          projectName
        Logger log  =  Logger.getLogger("SauceDemo1-15Oct-Project");
	
    @Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chrome update version driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "D:\\firefox\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
//		CONFIGURE LOG4J FILE HERE
		PropertyConfigurator.configure("Log4j.properties");
		
//		TO GENERATE LOG INFORMATION USE LOGGER METHOD LOG.INFO
		log.info("BROWSER IS OPEN");

		//		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		log.info("BROWSER IS MAXIMISED");
	
//		System.out.println("Browser is maximized");
	
	    driver.get("https://www.saucedemo.com/");
	    log.info("URL IS OPENED");
	    
//	    System.out.println("Url is opened");
	    
	    //take screenshot
	    UtilityClass.screenshotmethod(driver, "TC01_loginPageScreenshot");
	  	log.info("SCREENSHOT US TAKEN");
	    
//	    System.out.println("Screenshot is taken");
	    
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	   	    

	    LoginPOMClass lp = new LoginPOMClass(driver);   
	    
	    lp.sendusername();
	    log.info("USERNAME IS ENTERED");
	    
//	    System.out.println("Username is entered");
	    
	    lp.sendpassword();
	    log.info("PASSWORD IS ENTERED");
//	    System.out.println("Password is entered");
	    
	    lp.clickloginBtn();
	    log.info("CLICKED ON LOGIN BUTTON");
//	    System.out.println("Clicked on login button");

	    //homePage
	    log.info("WENT ON HOMEPAGE");
//	  	System.out.println("Went on homePage");
	  		 
	  	//take screenshot
	  	UtilityClass.screenshotmethod(driver, "TC01_homePageScreenshot");
	  	log.info("SCREENSHOT IS TAKEN");
//	  	System.out.println("Screenshot is taken");	  		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("BROWSER IS CLOSED");
		log.info("END OF PROGRAM");
//		System.out.println("Browser is closed");
//		System.out.println("End of Program");
		  	    
	}


}
