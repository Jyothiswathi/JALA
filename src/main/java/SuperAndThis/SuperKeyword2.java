package SuperAndThis;

public class SuperKeyword2 extends SuperKeyword {
	int a=11;
	public void display()
	{
		super.display();
		System.out.println("this is child");
		System.out.println(a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		SuperKeyword2 SuperKeyword2=new SuperKeyword2();
		SuperKeyword2.display();
		
		
	}

}
