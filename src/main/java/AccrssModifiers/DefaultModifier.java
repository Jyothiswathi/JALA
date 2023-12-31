package AccrssModifiers;

public class DefaultModifier {
	
	int a;
	String s="";
	void default1()
	{
	System.out.println(a + " "+s);	
	}
	
public static void main(String[] args) {
	DefaultModifier DefaultModifier=new DefaultModifier();
	DefaultModifier.a=2;
	DefaultModifier.s="joy";
	DefaultModifier.default1();
	
	
}

}
