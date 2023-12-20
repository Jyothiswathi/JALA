package Operators;

public class Arithmeticperators {
	
	public void addition(int a,int b)
	
	{
		System.out.println("addition is: "+(a+b));
	}
	
	public void substraction(int a,int b)
	{
		System.out.println("substraction is: "+( a-b));
	}
	
	public void multiplication(int a,int b)
	{
		System.out.println("multiplication is: "+(a*b));
	}
	
	public void division(int a,int b)
	{
		System.out.println("division is: "+(a/b));
	}
	public static void main(String[] args) {
		int a=20;
		int b=30;
		Arithmeticperators Arithmeticperators=new Arithmeticperators();
		Arithmeticperators.addition(a, b);
		Arithmeticperators.substraction(a, b);
		Arithmeticperators.multiplication(a, b);
		Arithmeticperators.division(b, a);
		
		
	}

}
