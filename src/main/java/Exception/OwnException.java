package Exception;

public class OwnException extends Exception{
	
	public OwnException(String s)
	{
	System.out.println(s);	
	}
	
	public static void main(String[] args)  throws OwnException{
		int a=17;
		if(a>18)
		{
			System.out.println("allow for vote");
		}
		else
		{
			throw  new OwnException("not allow for vote");
		}
				
	}

}
