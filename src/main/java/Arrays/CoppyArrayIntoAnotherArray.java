package Arrays;

public class CoppyArrayIntoAnotherArray {
	
public static int[] copy() {
	int a[]= {1,2,3,4,5};
	int newarray[]=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		newarray[i]=a[i];
	}
	return newarray;
}
public static void main(String[] args) {
	CoppyArrayIntoAnotherArray CoppyArrayIntoAnotherArray=new CoppyArrayIntoAnotherArray();
	int[] a = CoppyArrayIntoAnotherArray.copy();
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	
}
}
