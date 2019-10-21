package pages;

import org.openqa.selenium.WebDriver;

public class PageInterface {
	public HomePage homepage;
	public FlightFinder flightfinder;
	public FlightConfirmation flightconfirmation;
	public BookAFlight bookaflight;
	public SelectFlight selectflight;
	public PageInterface(WebDriver dr)
	{
		homepage=new HomePage(dr);
		flightfinder = new FlightFinder(dr);
		flightconfirmation= new FlightConfirmation(dr);
		bookaflight = new BookAFlight(dr);
		selectflight = new SelectFlight(dr);

	}
	
		
}
