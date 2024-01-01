package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		
		
List<String> al=new java.util.ArrayList<String>(Arrays.asList("jyo","jyothi"));
//adding elements
al.add("ram");
al.add("swathi");
al.add("triveni");
al.add("pavani");
al.add("suresh");


//iterate through iteraror
Iterator<String> names = al.iterator();
while(names.hasNext())
{
	System.out.println(names.next());
}

//specific index using add

al.add(1, "narmadha");
System.out.println(al);
//remove element
al.remove(1);
System.out.println(al);
//updating element
al.set(2, "swa");
System.out.println(al);
//finding size
System.out.println(al.size());
//chicking element presence
System.out.println(al.contains("jyo"));
//clear all the elements
al.clear();
System.out.println(al);


	}

}
