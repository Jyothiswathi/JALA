package AbstractClass;

public  class Abstract2 extends Abstract1{
	public static void main(String[] args) {
		Abstract2 Abstract2=new Abstract2();
		Abstract2.abstractMethod1();
		Abstract2.method1();
		Abstract1 Abstract1=new Abstract2();
		Abstract1.method1();
		
		
		
		
		
	}

	@Override
	void abstractMethod1() {
System.out.println("abstract method1");		
	}
	
	public  void method1()
	
	{
		System.out.println("method2");
		super.method1();
	}
	

}
