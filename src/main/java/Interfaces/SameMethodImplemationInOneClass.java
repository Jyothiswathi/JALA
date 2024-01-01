package Interfaces;

public class SameMethodImplemationInOneClass implements Interface4,Interface5 {

	@Override
	public void method5() {
System.out.println("method4");		
	}
public static void main(String[] args) {
	SameMethodImplemationInOneClass c=new SameMethodImplemationInOneClass();
c.method5();	
}
}
