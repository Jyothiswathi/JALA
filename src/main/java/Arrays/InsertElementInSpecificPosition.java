package Arrays;

import java.util.Arrays;

public class InsertElementInSpecificPosition {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		inserElement(a,4,4);
		System.out.println(Arrays.toString(a));

	}

	public static  void inserElement(int[] a, int indexNumber, int value) {
		for (int i = a.length - 1; i <= indexNumber; i--)

		{
			a[i] = a[i - 1];
		}
		a[indexNumber] = value;

	}

}
