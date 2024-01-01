package Interfaces;

import org.checkerframework.checker.units.qual.min;

public class ClassInterface2 implements Interface2 {

	@Override
	public void display3() {
System.out.println("display");		
	}

	@Override
	public void display4() {
System.out.println("display1");		
	}

public static void main(String[] args) { 
	ClassInterface2 ClassInterface2=new ClassInterface2();
	
	ClassInterface2.display3();
	//ClassInterface2.display4();

}
}
