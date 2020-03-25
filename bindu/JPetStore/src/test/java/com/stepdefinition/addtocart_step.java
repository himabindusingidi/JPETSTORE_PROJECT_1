package com.stepdefinition;

import com.pages.addtocart_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addtocart_step 
{
	
	addtocart_page a = new addtocart_page(); //importing the addtocart_page and creating an instance
	
	@Given("^open the url in browser$")
	public void open_the_url_in_browser()  
	{
	    a.url(); // calling the url method
	}

	@When("^the url is launched click on search and enter search content$")
	public void the_url_is_launched_click_on_search_and_enter_search_content()  
	{
	    a.search(); // calling the search method
	}

	@Then("^click on search button$")
	public void click_on_search_button()  
	{
	    a.searchbutton(); // calling the search button method
	}

	@Then("^click on product id$")
	public void click_on_product_id()  
	{
	    a.productID(); // calling the product ID method
	}

	@Then("^click on Item ID$")
	public void click_on_Item_ID()  
	{
	    a.ItemID(); // calling the Item ID method
	}

	@Then("^click on addtocart$")
	public void click_on_addtocart()  
	{
	   a.addtocart(); // calling the addtocart method
	}
}
