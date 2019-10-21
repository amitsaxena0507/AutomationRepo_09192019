package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightFinder {

	WebDriver dr;
	public FlightFinder(WebDriver dr)
	{
		this.dr=dr;
	}
	By signOff= By.xpath("//a[text()='SIGN-OFF']");
	
	public String clickSignOff()
	{
		dr.findElement(signOff).click();
		return dr.getTitle();
	}
}
