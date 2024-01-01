package Collections;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		
		//hash map
		Map<Integer,String> hm=new java.util.HashMap<Integer, String>();
		hm.put(1, "joy");
		hm.put(2, "jyothi");
		hm.put(3, "swathi");
		hm.put(4, "pavu");
		hm.put(5, "triveni");
		System.out.println(hm);
		
		//fetching data
		System.out.println(hm.get(5));
		//clone
		//System.out.println(hm.clone());
		
		//given key present or not
		System.out.println(hm.containsKey(1));
		//chicking value is present or not
		System.out.println(hm.containsValue("joy"));
		//chicking map is empty or not
		System.out.println(hm.isEmpty());
		//checking size
		System.out.println(hm.size());
		//using putall
		Map<Integer,String> hm1=new java.util.HashMap<Integer, String>();

		 hm1.putAll(hm);
		 System.out.println(hm1);
		 //keyset
		 hm.keySet();
		 System.out.println(hm.keySet());
		 //remove
		 System.out.println(hm.remove("pavu"));
	}

}
