package Interfaces;

public class InheritedClass implements InheritedInterface2 {

	public static void main(String[] args) {
		
		InheritedClass InheritedClass=new InheritedClass();
		InheritedClass.method1();
		InheritedClass.method2();
	}

	@Override
	public void method1() {
System.out.println("method1");		
	}

	@Override
	public void method2() {
		System.out.println("method2");
		
	}

}
