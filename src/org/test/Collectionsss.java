package org.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collectionsss {
public static void main(String[] args) {
	String s="$908890";
	String l = s.substring(1);
	
	System.out.println(l);
	
	if (s.contains("$")) {
		 s = s.replace("$", "");
		System.out.println(s);
	}
	
	int parseInt = Integer.parseInt(s);
	System.out.println(parseInt);
	
	List<Integer> li=new LinkedList<Integer>();
	li.add(80809);
	li.add(675777);
	li.add(1888);
	li.add(3435);
	
	List<String> lio=new LinkedList<String>();
	lio.add("vivo");
	lio.add("moto");
	lio.add("samsung");
	lio.add("redmi");
	
	//System.out.println(li);
	Collections.sort(li);
	System.out.println(Collections.max(li));
	System.out.println(Collections.min(li));
	Collections.sort(li);
	System.out.println(li);
	
	Collections.reverse(li);
	System.out.println(li);
	Collections.sort(li,Collections.reverseOrder());
	System.out.println(li);
	
	Map<String,Integer> mp=new LinkedHashMap<String,Integer>();
	
	for(int i=0; i<lio.size(); i=i+1) {
		System.out.println(lio.get(i)+"===="+li.get(i));
		mp.put(lio.get(i), li.get(i));
		
	}
	
	System.out.println(mp);
	
	System.out.println(mp.get("vivo"));
	System.out.println(mp.get(1888));
	System.out.println(mp.get("samsung"));
	
	Set<Entry<String,Integer>> entrySet = mp.entrySet();
	for(Entry<String,Integer>x:entrySet) {
		System.out.println(entrySet);
		
	}
	
	
}
}
