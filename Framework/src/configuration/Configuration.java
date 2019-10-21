package configuration;

public class Configuration {
	public final static String url="http://newtours.demoaut.com/";
	public final static String globalUserName="mercury";
	public final static String globalPassword="mercury";
	public final static String chromeDriverPath=System.getProperty("user.dir")
			+ "\\Drivers\\chromedriver.exe";
	public final static String firefoxDriverPath=System.getProperty("user.dir")
			+ "\\Drivers\\geckodriver.exe";
	public final static String testDataPath=System.getProperty("user.dir")+"\\src\\testData\\TestData.xls";
}
