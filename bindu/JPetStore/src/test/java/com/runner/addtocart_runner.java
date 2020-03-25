package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions

(
		features = "C:\\Users\\Deepika Gonnabattula\\Desktop\\bindu\\JPetStore\\src\\main\\resources\\Feature",
		plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		tags = {"@tc01_jpetstorelogin,@tc02_addtocart,@tc03_updatecart,@tc04_removefromcart,@tc05_signout"},
		glue = {"com.stepdefinition"},
		monochrome = true
		)

public class addtocart_runner 
{
	@AfterClass
	  public static void extendReport() 
	{
	      Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
	      Reporter.setSystemInfo("user", System.getProperty("user.name"));
	      Reporter.setSystemInfo("os", "Windows");
	      Reporter.setTestRunnerOutput("Sample test runner output message");
	}
	
	}

