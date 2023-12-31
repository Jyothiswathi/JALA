package TestNg;

import org.testng.annotations.Test;

public class IncovationCount {
	
	@Test (invocationCount = 10)
	public void InvocationCount()
	{
		System.out.println("invocation count");
	}

}
