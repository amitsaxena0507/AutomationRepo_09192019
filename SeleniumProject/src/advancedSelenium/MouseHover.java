package advancedSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHover {

	@Test
	public void test()
	{
		System.out.println("Launch chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.flipkart.com/");
		dr.manage().window().maximize();
		//Implicit wait
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement men=dr.findElement(By.xpath("//span[text()='Men']"));
		Actions act=new Actions(dr);
		act.moveToElement(men).build().perform();
		WebElement Shirt=dr.findElement(By.xpath("//a[text()='Shirts']"));
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(dr,5);
		wait.until(ExpectedConditions.visibilityOf(Shirt)).click();
	}
}
