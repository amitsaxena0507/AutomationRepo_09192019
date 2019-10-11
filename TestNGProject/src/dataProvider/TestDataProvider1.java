package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider1 {

	@Test(dataProvider="getData")
	public void login(String user, String pass)
	{
		System.out.println("Test login with username="+user+"and password="+pass);
	}

	@DataProvider
	public String[][] getData()
	{
		String[][] data = new String[3][2];

		//Row1
		data[0][0]="Username1";
		data[0][1]="Password1";

		//Row2
		data[1][0]="Username2";
		data[1][1]="Password2";

		//Row3
		data[2][0]="Username3";
		data[2][1]="Password3";
		
		return data;
	}

}
