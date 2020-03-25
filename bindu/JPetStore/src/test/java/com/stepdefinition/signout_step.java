package com.stepdefinition;

import com.pages.signout_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signout_step 
{
	signout_page g = new signout_page(); //importing the signout_page and creating an instance
			
	@Given("^the user has launched the chromebrowser$")
	public void the_user_has_launched_the_chromebrowser() 
	{
	    g.url(); // calling the url method
	}

	@When("^the user opens the JPetStore website$")
	public void the_user_opens_the_JPetStore_website() 
	{
	    g.loginpage(); //calling the loginpage method
	}

	@Then("^user clicking on login button$")
	public void user_clicking_on_login_button() 
	{
	   g.logindetails(); // calling the login details method
	}

	@Then("^the user enterS the username and password clicks on login button$")
	public void the_user_enterS_the_username_and_password_clicks_on_login_button() 
	{
	    g.submit(); // calling the submit method
	}

	@Then("^after login sign out from the application$")
	public void after_login_sign_out_from_the_application() 
	{
	    g.signout(); // calling the signout method
	}
	
}
