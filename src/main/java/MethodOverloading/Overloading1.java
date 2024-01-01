package MethodOverloading;

public class Overloading1 {
	
	public void display1()
	{
		System.out.println("display1");
	}
	public void display1(int a)
	{
		System.out.println(a);
	}
	
	public void display1(int a,String b, double c)
	{
		System.out.println(a+ " "+b+" "+c); 
		
	}
	public String display1(String s)
	{
	return s;
	}

	public static void main(String[] args) {
		Overloading1 a=new Overloading1();
		a.display1();
		a.display1(20);
		a.display1(3, "joy", 10);
	String a1 = a.display1("jyothi");
	System.out.println(a1);
		
		
		
	}

}
