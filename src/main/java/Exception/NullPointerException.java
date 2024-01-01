package Exception;

public class NullPointerException {
	public static void main(String[] args) {
		
		try {
			String a=null;
			System.out.println(a.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
