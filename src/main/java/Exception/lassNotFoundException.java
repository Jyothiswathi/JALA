package Exception;

public class lassNotFoundException {
	
	 public static void main(String[] args) {

	        try {
	            Class.forName("hello");
	            ClassLoader.getSystemClassLoader().loadClass("hello");

	        } catch (ClassNotFoundException e) {
	       
	            e.printStackTrace();
	        }
	    }

}
