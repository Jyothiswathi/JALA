package onstructors;

public class childClassConstructor extends DefaultOneTwoArgumentConstructor{
	
public	childClassConstructor()
{	super()	;
System.out.println("this is child constructor");
}
public static void main(String[] args) {
	childClassConstructor childClassConstructor=new childClassConstructor();
	
}
}
