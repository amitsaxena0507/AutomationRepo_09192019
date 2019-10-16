package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClass1 
{
	@Test
	public void login() throws InterruptedException
	{
		System.out.println("Launch chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("http://newtours.demoaut.com/");
		dr.manage().window().maximize();
		WebElement Username = dr.findElement(By.name("userName"));
		Username.sendKeys("mercury");
		//Thread.sleep(2000);
		Username.clear();
		//Thread.sleep(2000);
		Username.sendKeys("mercury");

		//Textbox
		dr.findElement(By.name("password")).sendKeys("mercury");

		//button
		dr.findElement(By.name("login")).click();
		//radio button
		System.out.println(dr.findElement(By.xpath("//input[@value='oneway']")).isSelected());
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		System.out.println(dr.findElement(By.xpath("//input[@value='oneway']")).isSelected());
		//dropdown
		WebElement pass = dr.findElement(By.xpath("//select[@name='passCount']"));
		Select sel= new Select(pass);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("2");
		Thread.sleep(2000);
		sel.selectByVisibleText("4");
		
		
		/*
		// click on continue button in flight finder
		dr.findElement(By.name("findFlights")).click();
		//click on continue button reserve flight page
		dr.findElement(By.name("reserveFlights")).click();
		//enter text in first name text box in book flight page
		dr.findElement(By.name("passFirst0")).sendKeys("Amit");
		//enter text in last name page.
		dr.findElement(By.name("passLast0")).sendKeys("saxena");
		//enter credit card number
		dr.findElement(By.name("creditnumber")).sendKeys("123344555555");
		dr.findElement(By.name("buyFlights")).click();*/
	}
}
