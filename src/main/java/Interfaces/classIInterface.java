package Interfaces;

public class classIInterface implements Interface1,Interface6 {

	@Override
	public void display() {
System.out.println("interface1");		
	}
public static void main(String[] args) { 
	classIInterface classIInterface=new classIInterface();
	classIInterface.display();
	
	
}
} 
