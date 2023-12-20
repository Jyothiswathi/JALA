package Loops;

public class MultipleIfElseStements {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		if ((a > b) && (a > c)) {
			System.out.println("largest: " + a);
		} else if ((b > a) && (b > c)) {
			System.out.println("Largest: " + b);
		} else {
			System.out.println("Largest: " + c);
		}

	}

}
