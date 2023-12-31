package Inheritance;

public class C extends B{
public	int a=3;
	public void c1()
	{
		System.out.println("c1");
	}
	public void c2()
	{
		System.out.println("c2");
	}
	public void display()
	{
		System.out.println("displayC");
		super.display();
	}
	
public static void main(String[] args) {
	A a=new A();
	B b=new B();
	C c=new C();
	a.a1();
	a.a2();
	a.display();
	b.a1();
	b.a2();
	b.b1();
	b.b2();
	b.display();
	c.a1();
	c.a2();
	c.b1();
	c.c2();
	c.display();
	System.out.println(a.a);
	System.out.println(b.a);
	System.out.println(c.a);
	a=new A();
	a.display();
	a=new B();
	a.display();		
	a=new C();
	a.display();
	A dm;
	A dm1=new B();
	System.out.println(dm1.a);

	dm=new A();
	System.out.println(dm.a);

	dm=new C();
	System.out.println(dm.a);

			
			
	
	
	
}
}
