package com.saucedemo.UtilityPACK;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass
{
	public static void screenshotmethod(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File destiFile=new File("D:\\SCREENSHOT\\"+name+".jpg");
		FileHandler.copy(sourceFile, destiFile);
	}


}
