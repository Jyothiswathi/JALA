package AccrssModifiers;

public class publicAccessMosdifier {
	public int a;
	public String s;
	public void display()
	{
		System.out.println(a+" "+s);
	}
	public static void main(String[] args) {
		publicAccessMosdifier publicAccessMosdifier=new publicAccessMosdifier();
		publicAccessMosdifier.a=10;
		publicAccessMosdifier.s="jyothi protected public";
		publicAccessMosdifier.display();
	
	}
}
