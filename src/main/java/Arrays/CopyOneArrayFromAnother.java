package Arrays;

public class CopyOneArrayFromAnother {

	public static void main(String[] args) {
		int a[]={1,2,3};
		int[] newArray=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			newArray[i]=a[i];
		}
		
	for(int i=0;i<newArray.length;i++)
	{
		System.out.println(newArray[i]);
	}
		

	}

}
