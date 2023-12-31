package protecpak;

import AccrssModifiers.ProtectedModifier;

public class ProtectedClass2 extends ProtectedModifier{
	public void protected2()
	{
		System.out.println("hii");
	}
	public static void main(String[] args) {
		ProtectedClass2 ProtectedClass2=new ProtectedClass2();
		ProtectedClass2.protected2();
		ProtectedClass2.a=20;
		ProtectedClass2.s="joy protected2";
		
		ProtectedClass2.display();
		
		
		
	}
	

}
