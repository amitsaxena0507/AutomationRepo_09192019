package basicAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestingClass3 {
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
		System.out.println("********************************************");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
}
