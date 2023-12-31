package SuperAndThis;

public class ConstructorUsingThis {
	int a;
	int b;
	public ConstructorUsingThis()
	{
	this(30,40);
	this.a=10;
	this.b=20;
	System.out.println(a);
	System.out.println(b);
	}
	ConstructorUsingThis(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
public static void main(String[] args) {
	
	ConstructorUsingThis ConstructorUsingThis=new ConstructorUsingThis();
}
}
