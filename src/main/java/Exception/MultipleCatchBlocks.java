package Exception;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);	
			int d[]= {1,2,3,4};
			System.out.println(d[10]);
		} 
	catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBounds Exception occurs");
	            e.getStackTrace();
	        } catch (Exception e) {
	            System.out.println("Parent Exception occurs");
	            e.getStackTrace();
	        }
		
	}
	

}
