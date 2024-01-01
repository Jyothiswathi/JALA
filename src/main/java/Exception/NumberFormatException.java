package Exception;

public class NumberFormatException {
public static void main(String[] args) {
	 String s="hii";
	 try {
		int a= Integer.parseInt(s);
		 System.out.println(a);
	} catch (java.lang.NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
