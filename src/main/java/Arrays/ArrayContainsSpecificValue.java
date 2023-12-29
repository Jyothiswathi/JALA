package Arrays;

import org.testng.annotations.Test;

public class ArrayContainsSpecificValue {

	@Test
	public void arrayContainsValue() {
		boolean isStatus = false;
		int a[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 4) {
				isStatus = true;
				break;
			}
		}

	}

}
