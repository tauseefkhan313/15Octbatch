package com.saucedemo.POMPACK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
// NO EXECUTION
//	NO MAIN METHOD
//	JUST ELEMENT FIND & ACTION ON THAT ELEMENT 
	
//	step1:-global variable declaration here
	private WebDriver driver;  
	
//	ACTIONS CLASS
	private Actions act;
	
//	username/password/login button element find action here
//	NOW WE R NOT GOING TO USE FINDELEMENT METHOD HERE
//	WebElement username=driver.findElement(By.xpath("xpath")); //not use now
	
	//WE R GONNA USE ANNOTATION METHOD OF FINDELEMENT-->START WITH @FindBy()
//	THIS WORKS LIKE METHOD ONLY
	
//	STEP 2:- FIND ELEMENT BY FindBy()
	@FindBy(xpath="//input[@id=\"user-name\"]")
	private WebElement username;
	
//	STEP3:-ELEMENT ACTION PERFORM IN METHOD
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	
//	PASSWORD ELEMENT
//	FindBy(id="password") or regular xpath
	@FindBy(id="password")
	private WebElement passwrd;
	public void sendpassword()
	{
		passwrd.sendKeys("secret_sauce");
	}
	
//	LOGIN ELEMENT
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
//	THIS IS REGULAR ACTION OF LOGINBTN
//	public void clickloginBtn()
//	{
//		loginBtn.click();
//	}
//	NOW WE USE MOUSE ACTIONS 
	public void clickloginBtn()
	{
//		THIS ACTIONS CLASS WE TAKE GLOBALLY IN A CONSTRUCTOR
//		Actions act=new Actions(driver);
		act.click(loginBtn).perform();
	}
	
	
//	STEP4:- CREATE CONSTRUCTOR
	public LoginPOMClass(WebDriver driver) //local variable
	{
//		we have GLOBAL VARIABLE to compare local and global we have THIS KEYWORD
//		globalvariable=localvariable
	       this.driver=driver;
//      or NOW WE R USING SELENIUM PAGEFACTORY CLASS
	       PageFactory.initElements(driver, this);
	       
//	       HERE WE CAN TAKE ACTIONS CLASS GLOBAL
	       act=new Actions(driver);
	}
	
	
//	TO CREATE POM CLASS THE FOLLOWING STEPS WE FOLLOWED
//	1.DECLARE WEBDRIVER GLOBALLY
//	2.@FINDBY() TO FIND ELEMENT
//	3.FOR ELEMENT ACTION WE CREATE METHOD
//	4.CONSTRUCTOR CREATE
}
