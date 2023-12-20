package Loops;

public class Amstrong {

	public static void main(String[] args) {
		int a = 153;
		int temp = a;
		int result = 0;
		int r;
		while (a != 0) {
			r = a % 10;
			result += r * r * r;
			a = a / 10;

		}
		if (temp == result) {
			System.out.println("Amstrong");
		} else

		{
			System.out.println("not amstrong");
		}
	}

}
