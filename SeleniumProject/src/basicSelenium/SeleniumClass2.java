package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass2 {
	@Test
	public void test() 
	{
		System.out.println("Launch chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("http://newtours.demoaut.com/");
		dr.manage().window().maximize();
		System.out.println(dr.findElement(By.linkText("REGISTER")).getText());
		System.out.println(dr.findElement(By.linkText("REGISTER")).getAttribute("href"));

		
		dr.findElement(By.partialLinkText("ISTER")).click();

	}

}
