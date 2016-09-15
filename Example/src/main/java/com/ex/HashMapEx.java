package com.ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Object, String> hm=new HashMap<Object, String>();
		hm.put(0, "Aaa");
		hm.put(1, "bbb");
		hm.put(null, null);
		hm.put(null, "amar");
		hm.put(2, "ccc");
		hm.put(4, "bujji");
		Set<Object> se=hm.keySet();
		Iterator<Object> itr=se.iterator();
		while(itr.hasNext())
		{
			Object key=itr.next();
			System.out.println("the key :"+key+"the value is"+hm.get(key));
		}
		
		/*for(Map.Entry<Object,String> m: hm.entrySet()){
			System.out.println("the key is::"+m.getKey()+"the value is"+m.getValue());
		}*/
		
		
 		
	}

}
