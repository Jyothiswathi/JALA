package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramaters {
	
	
	@Parameters({"url"})
	@Test
	public void testOne(String appUrl)
	{
		System.out.println("app url"+appUrl);
		
	}

}
