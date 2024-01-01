package Exception;

public class ArithmeticException {

	public static void main(String[] args) {
try {
	int c;

	int a=10;
	int b=0;
	c=a/b;
} catch (Exception e) {
	e.printStackTrace();
}

int a=1;
int b=0;
int c=a/b;
System.out.println(c);
	}

}
