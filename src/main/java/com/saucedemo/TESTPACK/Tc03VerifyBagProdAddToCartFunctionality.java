package com.saucedemo.TESTPACK;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPACK.HomePagePOMClass;

public class Tc03VerifyBagProdAddToCartFunctionality extends TestBaseClass
{
	@Test
	public void verifyBagProductAddToCartFunctionality() throws IOException
	{
		//bag product add to cart
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		
		hp.clickprdt1();
		log.info("CLICKED ON BAG PRODUCT");
//		System.out.println("Clicked on bag product");
		
		log.info("APPLY VERIFICATION");
//		System.out.println("Apply the validation");
		
		String expectedProductSelected = "1";
		
		String actualProductSelected = hp.getTextFromAddToCart();
		
//		if(expectedProductSelected.equals(actualProductSelected))
//		{
//			System.out.println("Bag Add to cart test case is passed");
//		}
//		else
//		{
//			System.out.println("Bag Add to cart test case is failed");
//		}
		log.info("ASSERTION APPLY FOR PERFECT RESULT");
		Assert.assertEquals(actualProductSelected, expectedProductSelected);
	}
	

}
