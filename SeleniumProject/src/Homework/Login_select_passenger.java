package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_select_passenger {

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("http://newtours.demoaut.com/");
		dr.manage().window().maximize();
		dr.findElement(By.name("userName")).sendKeys("mercury");;

		//Textbox
		dr.findElement(By.name("password")).sendKeys("mercury");

		//button
		dr.findElement(By.name("login")).click();
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
		dr.findElement(By.name("buyFlights")).click();
	}
}
