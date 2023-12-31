package TestNg;

import org.testng.annotations.Test;

public class InvocationTimeOut {
	
	@Test(invocationTimeOut = 2, expectedExceptions = NumberFormatException.class)
	public void invocationTimeOut(){
	System.out.println("a");	
	}

}
