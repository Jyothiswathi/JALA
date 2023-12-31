package TestNg;

import org.testng.annotations.Test;

public class DataProvider {
	
	
	@Test(dataProvider="login")
	public void doLogin(String username,String Password)
	{
		System.out.println( "user name: "+username+"password: "+Password);
	}
	
	
	@org.testng.annotations.DataProvider(name="login")
	public Object[][] loginParamaters()
	{
	Object[][] data= {{"abc","123"},{"def","456"}};	
	return data;
	
	}
	
	
	}
