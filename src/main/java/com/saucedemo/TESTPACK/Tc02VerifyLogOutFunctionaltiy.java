package com.saucedemo.TESTPACK;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPACK.HomePagePOMClass;
import com.saucedemo.UtilityPACK.UtilityClass;


public class Tc02VerifyLogOutFunctionaltiy extends TestBaseClass
{
	@Test
	public void verifyLogOutFunctionality() throws IOException
	{
	 //logOutActivity
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		
		hp.clicksettingBtn();
		log.info("CLICKED ON SETTING BUTTON");
//		System.out.println("Clicked on setting button");
		
		hp.clicklogout();
		log.info("CLICKED ON LOGOUT BUTTON");
//		System.out.println("Clicked on logOut Button");
		
		log.info("WENT ON FRONT LOGIN PAGE");
//		System.out.println("Went on loginPage");
		
		//take screenshot
	    UtilityClass.screenshotmethod(driver, "TC02_logOut_PageScreenshot");
	    log.info("SCREENSHOT IS TAKEN");
//	  	System.out.println("Screenshot is taken");
	  	
	    log.info("APPLY VERIFICATION");
//		System.out.println("Apply verification");
		  
		  //BA/PO/Dev-> acceptanace criteria
		String expectedTitle = "Swag Labs";   //given
		  
		String actualTitle   = driver.getTitle();
		  
//		  if(expectedTitle.equals(actualTitle))
//		  {
//			  System.out.println("LogOut Test case is passed");
//		  }
//		  else
//		  {
//			  System.out.println("LogOut Test case is failed");
//		  }
		log.info("ASSERTION APPLY FOR PERFECT RESULT");
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	

}
