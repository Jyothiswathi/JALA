package Interfaces;

public class classWithTwoInterfaces implements Interface1,Interface2  {

	public static void main(String[] args) {
		classWithTwoInterfaces classWithTwoInterfaces=new classWithTwoInterfaces();
		classWithTwoInterfaces.display();
		classWithTwoInterfaces.display3();
		classWithTwoInterfaces.display4();
	}

	@Override
	public void display3() {
System.out.println("display3");		
	}

	@Override
	public void display4() {
System.out.println("display4");		
	}

	@Override
	public void display() {
System.out.println("display");		
	}

}
