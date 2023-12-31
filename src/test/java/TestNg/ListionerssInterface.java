package TestNg;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listionerss.class)
public class ListionerssInterface {
	
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}

}
