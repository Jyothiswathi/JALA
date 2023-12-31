package TestNg;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	
	@Test
	public void softAssertions()
	{
	SoftAssert	SoftAssert=new SoftAssert();
	SoftAssert.assertTrue(false);
	System.out.println("hii");
	SoftAssert.assertAll();
	}
	
	
	@Test
	public void HarsdAssertions()
	{
		int a=5;
		int b=6;
		Assert.assertTrue(a<b,"condition not satisfied");
		//Assert.assertFalse(a>b);
		
		
	}



}
