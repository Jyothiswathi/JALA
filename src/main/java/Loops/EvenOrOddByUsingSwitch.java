package Loops;

public class EvenOrOddByUsingSwitch {

	public static void main(String[] args) {

		int i = 4;
		switch (i % 2) {
		case 0:
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");
			break;
		}

	}

}
