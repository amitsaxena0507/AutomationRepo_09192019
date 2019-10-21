package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginClass {
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
	}
}
