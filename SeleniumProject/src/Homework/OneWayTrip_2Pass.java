package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OneWayTrip_2Pass {

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
		System.out.println(dr.findElement(By.xpath("//input[@value='oneway']")).isSelected());
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		WebElement pass = dr.findElement(By.xpath("//select[@name='passCount']"));
		Select sel= new Select(pass);
		sel.selectByIndex(1);
		

		// click on continue button in flight finder
		dr.findElement(By.name("findFlights")).click();
		//click on continue button reserve flight page
		dr.findElement(By.name("reserveFlights")).click();
		//enter text in first name text box in book flight page
		dr.findElement(By.name("passFirst0")).sendKeys("Amit");
		//enter text in last name page.
		dr.findElement(By.name("passLast0")).sendKeys("saxena");
		//enter text in first name text box in book flight page
		dr.findElement(By.name("passFirst1")).sendKeys("Pavi");
		//enter text in last name page.
		dr.findElement(By.name("passLast1")).sendKeys("saxena");
		
		//enter credit card number
		dr.findElement(By.name("creditnumber")).sendKeys("123344555555");
		dr.findElement(By.name("buyFlights")).click();

	}
}