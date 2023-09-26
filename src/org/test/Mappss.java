package org.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mappss {

	public static void main(String[] args) {
       Map<Integer,String> mp=new Hashtable<>();
       
       mp.put(10, "java");
       mp.put(20, "selenium");
       mp.put(30, "python");
       mp.put(40, "ruby");
       mp.put(50, "bigdata");
       mp.put(60, "c#");
       mp.put(70, "sql");
       mp.put(80, "oracle");
       
		System.out.println(mp);
		
		//size
		int size = mp.size();
		System.out.println(size);
		
		//get particular value
		String string = mp.get(50);
		System.out.println(string);
		
		//remove
		String remove = mp.remove(50);
		System.out.println(remove);
		System.out.println(mp);
		
		//keycheck
		boolean containsKey = mp.containsKey(50);
		System.out.println(containsKey);
		
		//value check
		boolean containsValue = mp.containsValue("selenium");
		System.out.println(containsValue);
		
		//get keys only
		Set<Integer> keySet = mp.keySet();
		System.out.println(keySet);
		
		//get values only
		Collection<String> values = mp.values();
		System.out.println(values);
		
		//entry set(iterating model like array)
		Set<Entry<Integer,String>> entrySet = mp.entrySet();
		System.out.println(entrySet);
		
		
		//get all values(iterating model)
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);	
		}

	}

}
