package Arrays;

public class SecondLargestArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(a[a.length-2]);

	}


}
