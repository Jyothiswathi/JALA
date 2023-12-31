package Static;

public class createInstanceVariablesStaticVariables {
	static int a = 10;
	static int b = 20;
	int c = 30;
	int d = 40;

	public static void display1() {
		System.out.println("display1");
		createInstanceVariablesStaticVariables a = new createInstanceVariablesStaticVariables();
		System.out.println(a.c);
		a.display3();
	}

	public static void display2() {
		createInstanceVariablesStaticVariables a = new createInstanceVariablesStaticVariables();
		System.out.println(a.d);
		System.out.println("display2");
		a.display3();
	}

	public void display3() {
		display1();
		System.out.println("display3");
	}

	public void display4() {
		display2();
		System.out.println("display4");
	}

	public static void main(String[] args) {
		createInstanceVariablesStaticVariables a = new createInstanceVariablesStaticVariables();
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.c);
		System.out.println(a.d);
		display1();
		display2();
		a.display3();
		a.display4();
	}

}
