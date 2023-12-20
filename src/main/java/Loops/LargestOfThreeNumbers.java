package Loops;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the second number");
		int b = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the Third number");
		int c = s2.nextInt();

		if ((a > b) && (a > c)) {
			System.out.println("largest is " + a);

		} else if ((b > a) && (b > c)) {
			System.out.println("largest is " + b);
		} else {
			System.out.println("largest is " + c);

		}

	}

}
