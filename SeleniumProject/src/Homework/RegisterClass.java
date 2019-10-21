package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterClass {
	@Test
	public void login()
	{
		System.out.println("Launch chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("http://newtours.demoaut.com/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//a[text()='REGISTER']")).click();
		dr.findElement(By.xpath("//input[@name='firstName']")).sendKeys("amit");
		dr.findElement(By.xpath("//input[@name='lastName']")).sendKeys("saxena");
		dr.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567890");
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("amitsaxena0507@gmail.com");
		dr.findElement(By.xpath("//input[@name='email']")).sendKeys("amitsaxena0507");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("Albat@123");
		dr.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Albat@123");
		dr.findElement(By.xpath("//input[@name='register']")).click();
	}
}
