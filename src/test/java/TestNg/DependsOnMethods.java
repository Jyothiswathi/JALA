package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test
	public void login()
	{
		System.out.println("login");
	Assert.assertTrue(false);
		
	}
	
	
	@Test  (dependsOnMethods = "login")
	public void registration()
	{
		System.out.println("registration");
	}
// it will skip when first testcase was failure

}
