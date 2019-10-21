package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import configuration.Configuration;
import libraries.ApplicationLibrary;
import pages.PageInterface;

public class TC_FlightBooking_Login {
	
	PageInterface page;
	WebDriver dr;
	ApplicationLibrary lib;
	
	@BeforeClass	
	public void initialize()
	{
		lib=new ApplicationLibrary();
		
		//Launch Browser
		dr=lib.launchBrowser("Chrome");
		page=new PageInterface(dr);
	}
	
	@Test
	public void logintest()
	{
		lib.navigate(dr, Configuration.url);
		String temp=page.homepage.login(Configuration.globalUserName, Configuration.globalPassword);
		Assert.assertTrue(temp.contains("Find a Flight"));
	}
	
	@Test
	public void logouttest()
	{
		String temp=page.flightfinder.clickSignOff();
		Assert.assertTrue(temp.contains("Sign-on"));
	}
	
	@AfterClass
	public void tearDown()
	{
		dr.quit();
	}
}
