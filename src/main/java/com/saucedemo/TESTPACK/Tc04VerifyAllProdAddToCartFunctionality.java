package com.saucedemo.TESTPACK;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPACK.HomePagePOMClass;


public class Tc04VerifyAllProdAddToCartFunctionality extends TestBaseClass
{
	@Test
	public void verifyAllProductProductAddToCartFunctionality() throws IOException
	{		
		//all products add to cart
		HomePagePOMClass hp = new HomePagePOMClass(driver);
				
		hp.clickMultipleprdt();
		log.info("CLICKED ON ALL PRODUCT");
//		System.out.println("Clicked on all products");
		
		log.info("APPLY VERIFICATION");
//		System.out.println("Apply the validation");
				
		String expectedProductSelected = "6";
				
		String actualProductSelected = hp.getTextFromAddToCart();
				
//		if(expectedProductSelected.equals(actualProductSelected))
//		{
//			System.out.println("all product Add to cart test case is passed");
//		}
//		else
//		{
//		    System.out.println("all product Add to cart test case is failed");
//		}
		log.info("ASSERTION APPLY FOR PERFECT RESULT");
		Assert.assertEquals(actualProductSelected, expectedProductSelected);

	}
	

}
