package com.stepdefinition;

import com.pages.login_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_step 
{
	login_page a = new login_page(); //importing the login_page and creating an instance 
	
	@Given("^the user launched the chromebrowser$")
	public void the_user_launched_the_chromebrowser()  
	{
	    a.url();  // calling the url method
	}

	@When("^the user open the JPetStore website$")
	public void the_user_open_the_JPetStore_website()  
	{
	    a.loginpage(); // calling the login page method
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  
	{
	   a.logindetails(); // calling the login details method
	}

	@Then("^the user enters the username and password clicks on login button$")
	public void the_user_enters_the_username_and_password_clicks_on_login_button() throws InterruptedException  
	{
	    a.submit(); // calling the submit method
	}

}
