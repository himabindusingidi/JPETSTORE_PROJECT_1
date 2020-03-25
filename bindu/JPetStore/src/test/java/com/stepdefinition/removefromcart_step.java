package com.stepdefinition;

import com.pages.removefromcart_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class removefromcart_step 
{
	removefromcart_page h = new removefromcart_page();//importing the removefromcart_page and creating an instance
	
	@Given("^open the given url in the browser$")
	public void open_the_given_url_in_the_browser()  
	{
	   h.url(); // calling the url method
	}

	@When("^the url is launched then click on search and enter search content$")
	public void the_url_is_launched_then_click_on_search_and_enter_search_content()  
	{
	    h.search(); // calling the search method
	}

	@Then("^click on the Search button$")
	public void click_on_the_Search_button() 
	{
		h.searchbutton(); // calling the search button method
	    
	}

	@Then("^click on product ID$")
	public void click_on_product_ID() 
	{
	    h.productID(); // calling the product ID method
	}

	@Then("^click on Item id$")
	public void click_on_Item_id()  
	{
	   h.ItemID(); // calling the ItemID method
	}

	@Then("^click on AddToCart$")
	public void click_on_AddToCart()  
	{
	   h.addtocart(); // calling add to cart method
	}

	@Then("^click on RemoveFromCart$")
	public void click_on_RemoveFromCart()  
	{
	    h.removefromcart(); // calling remove from cart method
	}


	}

	


