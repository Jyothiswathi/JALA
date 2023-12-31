package TestNg;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListionersInterface.class)
public class Listioners {
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}

}
