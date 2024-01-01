package Collections;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
	public static void main(String[] args) {
		
		Set<String> s=new java.util.HashSet<String>();
		s.add("joy");
		s.add("swathi");
		s.add("triveni");
		s.add("pavani");
		//dont allow dupicates
		s.add("pavani");
		System.out.println(s);
		//iterating
		Iterator<String> it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//remove element
		s.remove("triveni");
	System.out.println(s);
	//check empty or not
	System.out.println(s.isEmpty());
		//size
	System.out.println(s.size());
	//contains
	System.out.println(s.contains("joy"));
	//clear
	s.clear();
	System.out.println(s);
	}

}
