package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import configuration.Configuration;

public class ApplicationLibrary {

	public WebDriver launchBrowser(String browserName)
	{
		WebDriver dr=null;
		if(browserName.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", Configuration.chromeDriverPath);
			dr = new ChromeDriver();
			dr.manage().window().maximize();
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", Configuration.firefoxDriverPath);
			dr = new FirefoxDriver();
			dr.manage().window().maximize();
		}
		return dr;
	}
	public String navigate(WebDriver dr,String url)
	{
		dr.get(url);
		return dr.getTitle();
	}
}
