package Strings;

public class Strings {
	
public void diffWaysOfCreatingStrings()
{
	//method1
	String s="this is jyothi";
	//method2
	String s1=new String("this is swathi");
	System.out.println(s);
	System.out.println(s1);
}
	public void concatinating()
	{
		String s="hello";
		String s1="joy";
		String s3=s+s1;
		System.out.println(s3);
	}
	public void StringLength()
	{
		String s="hello";
		System.out.println(s.length());
	}
	public void subString()
	{
	String s="helloHai"	;
	String s2="jyothi";
	String s1=s.substring(3);
	System.out.println(s1);
	 String sub =s2.substring(1, 3);
     System.out.println("Extracted string : " + sub);


	}
	public void indexOf()
	{
		String s="this is joy";
		System.out.println(s.indent(1));
	}
	public void regularExpressions()
	{
		  String ms = "this is jyothi";
	        boolean match = ms.matches("(.*)jyothi(.*)");
	        System.out.println("Matches : " + match);
	}
	public void equalsTo()
	{
		boolean isEquals=false;
		boolean isEqualIgnore=false;
		String a="hello";
		String b="Hello";
		if(a.equals(b))
		{
			isEquals=true;
		}
		if(a.equalsIgnoreCase(b))
		{
			isEqualIgnore=true;
		}
		boolean startswith = a.startsWith("h");
		System.out.println(startswith);
		boolean endsWith = a.endsWith("l");
		System.out.println(endsWith);
	int compare	=a.compareTo(b);
		
		System.out.println(compare);
	}
	
	public void trim()
	{
		String s=" this is joy";
		String s1 = s.trim();
		System.out.println(s1);
	}
	
	public void replace()
	{
		String s="heiio";
		String s1=s.replace('l', 'i');
		System.out.println(s1);
	}

	public void split()
	{
		String s="this is jyothi";
	String[]	s1=s.split(" ");
	System.out.println(s1.length);
	}
	public void valueOf()
	{
		int a=10;
		System.out.println(String.valueOf(a));
		
	}
	public void upperLower()
	{
		String s="Hello";
				String lower = s.toLowerCase();
				String upper=s.toUpperCase();
				System.out.println(lower);
				System.out.println(upper);
	}
	public void convertingIntegerToString()
	
	{
		int a=10;
		System.out.println(Integer.toString(10));
	}
	public static void main(String[] args) {
		Strings s=new Strings();
		s.convertingIntegerToString();
		s.concatinating();
		s.diffWaysOfCreatingStrings();
		s.equalsTo();
		s.regularExpressions();
		s.regularExpressions();
		s.split();
		s.toString();
		s.upperLower();
		s.valueOf();
		
		
		
		

	}

}
