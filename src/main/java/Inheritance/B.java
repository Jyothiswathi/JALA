package Inheritance;

public class B extends A{
	public int a=2;
	public void b1()
	{
		System.out.println("b1");
	}
	public void b2()
	{
		System.out.println("b2");
	}
	public void display()
	{
		System.out.println("displayb");
		super.display();
	}

}
