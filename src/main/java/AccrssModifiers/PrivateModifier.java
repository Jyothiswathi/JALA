package AccrssModifiers;

public class PrivateModifier {
	private int a;
	private String s;
	private void display()
	{
		System.out.println(a+" "+s);
	}
	public static void main(String[] args) {
		PrivateModifier PrivateModifier=new PrivateModifier();
		PrivateModifier.a=10;
		PrivateModifier.s="jyothi";
		PrivateModifier.display();
		
		
	}

}
