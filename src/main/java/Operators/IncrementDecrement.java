package Operators;

public class IncrementDecrement {

	public void preIncrement(int a, int b) {
		int c;
		c = a + (++b);
		System.out.println("pre-increment is" + c);
	}

	public void postIncrement(int a, int b) {
		int c;
		c = a + (b++);
		System.out.println("post increment is: " + c);
	}

	public void preDrecement(int a, int b) {
		int c;
		c = a + (--b);
		System.out.println("pre decrement is :" + c);
	}

	public void postDecrement(int a, int b) {
		int c;
		c = a + (b--);
		System.out.println("post decrement is:" + c);
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		IncrementDecrement IncrementDecrement = new IncrementDecrement();
		IncrementDecrement.preIncrement(a, b);
		IncrementDecrement.postIncrement(a, b);
		IncrementDecrement.preDrecement(a, b);
		IncrementDecrement.postDecrement(a, b);
	}

}
