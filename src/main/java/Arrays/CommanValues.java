package Arrays;

import org.checkerframework.checker.units.qual.Length;

public class CommanValues {

	public static void main(String[] args) {
int a[]= {1,2,3};
int b[]= {3,4,5};
for(int x:a)
{
	for(int y:b)
	{
		if(x==y)
		{
			System.out.println(x);
		}
	}
}


	}

}
