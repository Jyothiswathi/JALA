package Arrays;

public class ArrayContainsElements {

	public static void main(String[] args) {
		int a[]= {1,2,12,22,23};
		boolean num1=false;
		
		boolean num2=false;
		
	for(int x:a)
	{
		if(x==12)
		{
			num1=true;
			System.out.println("this array contains 12");
		}
		if(x==23)
		{
			num2=true;
			System.out.println("this array contains 23");
		}
		
	}
		

	}

}
