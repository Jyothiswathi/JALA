package onstructors;

public class DefaultOneTwoArgumentConstructor {
	
public	DefaultOneTwoArgumentConstructor()
{
	this(50);

System.out.println("default constructor");
}
public DefaultOneTwoArgumentConstructor(int a)
{
	System.out.println(a);
}
public DefaultOneTwoArgumentConstructor(int a,String s)
{
	System.out.println(a+ " "+s);
}
	
public static void main(String[] args) {
	
	DefaultOneTwoArgumentConstructor DefaultOneTwoArgumentConstructor=new DefaultOneTwoArgumentConstructor();
	DefaultOneTwoArgumentConstructor DefaultOneTwoArgumentConstructor1=new DefaultOneTwoArgumentConstructor(20);
	DefaultOneTwoArgumentConstructor DefaultOneTwoArgumentConstructor2=new DefaultOneTwoArgumentConstructor(30,"joy");
	
}
}
