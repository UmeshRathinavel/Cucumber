package com.PageObjectModel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class Home_Page extends BaseClass{
	
	public Home_Page() {
	
		PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//span[text()='SHOP MEN']")
	private WebElement shopmen;
	
	
	public WebElement getShopmen() {
		return shopmen;
	}
     @FindBy(xpath = "//a[@id='kids_category']")
     private WebElement kids;
     
     public WebElement getKids() {
		return kids;
	}
   
     


	@FindBy(xpath = "//a[text()='Giny & Jony']")
     private WebElement ginyjony;
	public WebElement getGinyjony() {
		return ginyjony;
	}
     
     @FindBy(xpath = "//img[@src='//img3.junaroad.com/uiproducts/17886998/zoom_0-1627562555.jpg']")
     private WebElement yellowtshirt;

 	public WebElement getYellowtshirt() {
 		return yellowtshirt;
 	}
     
     @FindBy(xpath = "//span[text()='colour']")
     private WebElement colour;
     public WebElement getColour() {
 		return colour;
 	}
     
     @FindBy(xpath = "//div[text()='blue']")
     private WebElement bluetshirt;

 	public WebElement getBluetshirt() {
 		return bluetshirt;
 	}
 	@FindBy (xpath = "//span[@id='size_27838470']")
 	private WebElement selectsize;
     
     public WebElement getSelectsize() {
		return selectsize;
	}

	public void setSelectsize(WebElement selectsize) {
		this.selectsize = selectsize;
	}
	@FindBy(xpath = "//div[text()='ADD TO CART']")
     private WebElement addtocart;

 	public WebElement getAddtocart() {
 		return addtocart;
 	}
	}