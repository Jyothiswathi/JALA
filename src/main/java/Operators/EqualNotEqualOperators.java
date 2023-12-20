package Operators;

import java.util.Scanner;

public class EqualNotEqualOperators {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int a = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the second number");
		int b = s1.nextInt();
		if (a == b) {
			System.out.println("a is equal to b");
		} else if (a != b) {
			System.out.println("a is not equal to b");
		}

	}

}
