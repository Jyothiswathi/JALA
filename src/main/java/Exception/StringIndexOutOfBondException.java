package Exception;

public class StringIndexOutOfBondException {

	public static void main(String[] args) {

		String s="hello";
		try {
			char a=s.charAt(-1);
			System.out.println(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
