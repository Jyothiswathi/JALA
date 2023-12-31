package Arrays;

public class MinMax {
	
	public static void min(int a[])
	{
	int min=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(min>a[i])
		{
			min=a[i];
		}
	}
	System.out.println("min value is "+ min);
	}
	
	public static void max(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(" max value is "+max);
	}
	public static void main(String[] args) {
		int a[]= {1,2,3};
		min(a);
		max(a);
	}

}
