package basicSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass3 {
	@Test
	public void test()
	{

		System.out.println("Launch chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		dr.manage().window().maximize();
		dr.switchTo().frame("iframeResult");
		WebElement ele = dr.findElementByName("vehicle1");
		System.out.println(ele.isSelected());
		ele.click();
		System.out.println(ele.isSelected());
		
	}

}

