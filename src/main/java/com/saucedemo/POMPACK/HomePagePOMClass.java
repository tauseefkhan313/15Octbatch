package com.saucedemo.POMPACK;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass 
{
	 private WebDriver driver;
//   DROPDOWN HANDLE INITIALIZE GLOBALLY HERE AND PASS IN CONSTRUCTOR 
   private Select s;
//   HOME PAGE 
//   SETTING/MENU BUTTON ELEMENT
   @FindBy(xpath="//button[@id=\"react-burger-menu-btn\"]")
   private WebElement settingBtn;
   
//   create method
   public void clicksettingBtn()
   {
   	settingBtn.click();
   }
   
//   ABOUT BUTTON
   @FindBy(xpath="//a[@id=\"about_sidebar_link\"]")
   private WebElement aboutBtn;
   public void ClickOnAboutBtn()
   {
   	aboutBtn.click();
   }
   
//   LOGOUT BTN
   @FindBy(xpath="//a[@id=\"logout_sidebar_link\"]")
   private WebElement logOutBtn;
   public void clicklogout()
   {
   	logOutBtn.click();
   }
   
   @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
   private WebElement Prdt1;
   public void clickprdt1()
   {
  	 Prdt1.click();
   }
   
   @FindBy(xpath="//a[@class=\"shopping_cart_link\"]")
   private WebElement AddToCartButton;
   public void ClickAddToCartBtn()
   {
  	    AddToCartButton.click();
   }
   
 
//   CHECK IN CART BUTTON
   @FindBy(xpath="//span[@class=\"shopping_cart_badge\"]")
   private WebElement AddToCartBtn;

//   we want verification in gettext to find total prdt in cart
//   so we neen here to create method in string instead of void
   public String getTextFromAddToCart()
   {
  	 String actualprdtSelected=AddToCartBtn.getText(); //text in string
  	 return actualprdtSelected;  //2 product
   }
   
//   SELECT MULTIPLE PRODUCT
   @FindBy(xpath="//button[text()='Add to cart']")
   private List<WebElement> multiProduct; //select indexwise all product/multiple prdt
   public void clickMultipleprdt()
   {
//   	for(int i=0;i<multiProduct.size();i++) //select one by one prdt using FORLOOP
//   	{                                      //this loop doesn't cover all prdt
//   		multiProduct.get(i).click();
//   	}
   	
//   	USING FOR..EACH LOOP
   	for(WebElement Selectallprdt:multiProduct)
   	{
   		Selectallprdt.click();
   	}
   	
   }
   //why OUR TEST CASE IS FAIL BCZ WE R USING REGULAR FORLOOP 
	//for regular concept-use for loop
	//for collection concept -always use for each loop
	
//   DROP DOWN METHOD 
   @FindBy(xpath="//select[@class=\"product_sort_container\"]") 
   private WebElement dropDown;
   
   public void clickondropDown()
   {
   	dropDown.click();
   	
   	s.selectByValue("lohi");
   }
   
//   create constructor
   public HomePagePOMClass(WebDriver driver)
   {
   	this.driver=driver;
//   	selenium class PageFactory
   	PageFactory.initElements(driver,this);
   	
   	s=new Select(dropDown);
   }

}
