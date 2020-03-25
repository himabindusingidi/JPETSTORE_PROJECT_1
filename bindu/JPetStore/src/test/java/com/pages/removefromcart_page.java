package com.pages;


import java.io.File;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class removefromcart_page //removing the items from the cart
{
	WebDriver driver; //creating webdriver as local variable
	
	By search = By.xpath("//*[@id=\"SearchContent\"]/form/input[1]");
	By searchbutton = By.xpath("//*[@id=\"SearchContent\"]/form/input[2]");
	By productID = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]/b/a/font");
	By ItemID = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a");
	By addtocart = By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a");
	By removefromcart = By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a");
	
	
	public void browserLaunch(String browser,String url)
	{
		try {
					//To launch firefox Browser
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","D:\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
					// To launch chrome Browser
			else if (browser.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver","webdriver.chrome.driver\",D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
			}
					// To launch InternetExplorer
			else if (browser.equalsIgnoreCase("Internet Explore")) {
					System.setProperty("webdriver.ie.driver","D:\\Downloads\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();  
			}
					//to maximize the window
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		
		} 
		catch (WebDriverException e) 
		{
			System.out.println("Browser could not be launched");
		}
	}
	
	public void url() //opening the chrome browser
	{
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		System.out.println(driver.getTitle());
	}


	public void search() // method for search
	{
		driver.findElement(search).sendKeys("fish");
	}

	public void searchbutton() // method for search button
	{
		driver.findElement(searchbutton).click();
	}

	public void productID() // method for product ID
	{
		driver.findElement(productID).click();
	}

	public void ItemID() // method for Item ID
	{
		driver.findElement(ItemID).click();
	}

	public void addtocart() // method for add to cart
	{
		driver.findElement(addtocart).click();
	}
	
	public void removefromcart() // method to remove an item from the cart
	{
		driver.findElement(removefromcart).click();
		
		//To take the Screenshot
		
			Date date = new Date(0);
			String datestr = date.toString().replace(":", "-");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File screenshot = ts.getScreenshotAs(OutputType.FILE);
			screenshot.renameTo(new File("src/test/resources/screenshot/image4"+datestr+".png"));
		driver.close(); // close the browser
	}
}
