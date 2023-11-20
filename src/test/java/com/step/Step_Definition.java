package com.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;

import com.BaseClass.BaseClass;
import com.PageObjectModel.Home_Page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import okio.Timeout;

public class Step_Definition extends BaseClass{
	
	 Home_Page home = new Home_Page();
	
	@When("user launch the url {string}")
	public void user_launch_the_url(String url) 
	{
		launchurl(url);
	}
	@And("user click on shop men")
	public void user_click_on_shop_men() throws InterruptedException {
		Thread.sleep(5000);
		click(home.getShopmen());
	    
	}
	@When("user clicks kids")
	public void user_clicks_kids() {
		actionsmoveto(home.getKids());
	}


	//Some other steps were also undefined:

	@Given("user select the brands giny & jony")
	public void user_select_the_brands_giny_jony() throws Exception{
		Thread.sleep(3000);
		click(home.getGinyjony());
		

	    
	}
	@Given("user click product")
	public void user_click_product() throws Exception {
		implicitywait(30);
		javascript();
		click(home.getYellowtshirt());
	    
	}
	@Given("user clicks select colour")
	public void user_clicks_select_colour() {
		click(home.getColour());
		click(home.getBluetshirt());
		click(home.getSelectsize());
	    
	}
	@Given("user clicks add to cart")
	public void user_clicks_add_to_cart() throws Exception {
		Thread.sleep(3000);
		click(home.getAddtocart());
	   
	}


}
