package onstructors;

public class PublicPrivateProtected {
	int a;
	int b;
	public PublicPrivateProtected()
	{
		this(20,40);
	System.out.println("default constructor");	
	}
	public PublicPrivateProtected(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
	}
	
	private PublicPrivateProtected(int a, String s)

	{
		this.a=a;
		s="hii";
		System.out.println(a);
		System.out.println(s);
	}
	protected PublicPrivateProtected(String a, int s)

	{
		this.a=s;
		a="hii";
		System.out.println(a);
		System.out.println(s);
	}
	

	public static void main(String[] args) {
		
		 PublicPrivateProtected PublicPrivateProtected=new PublicPrivateProtected();
		 
		 
		

	}
//constructor cannot have return type
	//cannot call multiple constructer with same object
}
