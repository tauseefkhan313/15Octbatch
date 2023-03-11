package com.saucedemo.TESTPACK;




import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc01VerifyLoginFunctionality extends TestBaseClass
{
	@Test
	public void verifyLoginFunctionality() throws IOException
	{	 
		log.info("APPLY VERIFAICATION");
//	  System.out.println("Apply verification");
		  
		  //BA/PO/Dev-> acceptanace criteria
		String expectedTitle = "Swag Labs";   //given
		  
		String actualTitle   = driver.getTitle();
		  
//		  if(expectedTitle.equals(actualTitle))
//		  {
//			  System.out.println("Login Test case is passed");
//		  }
//		  else
//		  {
//			  System.out.println("Login Test case is failed");
//		  }
		log.info("ASSERTION APPLY FOR PERFECT VERIFICATION RESULT");
//		HARD ASSERTION USE TO FIND EXACT RESULT 
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	

}
