package JavaBasics;

public class LocalGlobalVariables {
	int a = 100;

	public static void main(String[] args) {
		LocalGlobalVariables LocalGlobalVariables = new LocalGlobalVariables();
		LocalGlobalVariables.variables();
		System.out.println("Global variable value is " + LocalGlobalVariables.a);

	}

	public void variables() {
		int a = 10;
		System.out.println("local variable value is " + a);

	}

}
