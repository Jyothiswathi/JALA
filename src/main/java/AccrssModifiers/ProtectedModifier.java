package AccrssModifiers;

public class ProtectedModifier {

	protected int a;
	protected String s;
	protected void display()
	{
		System.out.println(a+" "+s);
	}
	public static void main(String[] args) {
		ProtectedModifier ProtectedModifier=new ProtectedModifier();
		ProtectedModifier.a=10;
		ProtectedModifier.s="jyothi protected";
		ProtectedModifier.display();
	
}
}
