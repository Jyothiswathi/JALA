package JavaBasics;

public class creatingObject {

	public void thisIsMethod() {
		String a = "This is method";
		System.out.println(a);
	}

	public static void main(String[] args) {
		// creating object
		creatingObject creatingObject = new creatingObject();

		creatingObject.thisIsMethod();
	}

}
