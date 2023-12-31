package SuperAndThis;

public class ThisKeyWord {
	 int a=10;
	public  void display()
	{
		int a=11;
		System.out.println(a);
		System.out.println(this.a);
		
	}
	public static void main(String[] args) {
		//display();
		ThisKeyWord ThisKeyWord=new ThisKeyWord();
		ThisKeyWord.display();
		
	}

}
