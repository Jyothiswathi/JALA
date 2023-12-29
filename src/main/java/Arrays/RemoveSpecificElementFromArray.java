package Arrays;

public class RemoveSpecificElementFromArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		RemoveSpecificElementFromArray RemoveSpecificElementFromArray = new RemoveSpecificElementFromArray();
		RemoveSpecificElementFromArray.remove(a, 2);
	}

	public int[] remove(int arr[], int index) {
		int anotherArrcay[] = new int[arr.length - 1];
		if (arr == null || index < 0 || index >= arr.length) {
			return arr;
		}
		for (int i = 0, k = 0; i < arr.length; i++) {

			if (i == index) {
				continue;
			}

			anotherArrcay[k++] = arr[i];
		}
		for (int i = 0; i < anotherArrcay.length; i++) {
			System.out.println(anotherArrcay[i]);
		}

		return anotherArrcay;

	}
}
