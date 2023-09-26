package org.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Rough {
	
	
	public static void main(String[] args) throws IOException {
//		childclass of ALL list allowed n null...
//		List<Integer> l=new LinkedList<>();
//		
//		l.add(10);
//		l.add(null);
//		l.add(null);
//		l.add(40);
//		l.add(20);
//		l.add(30);
//		l.add(null);
//		
//		System.out.println(l.get(4));
//		l.remove(4);
//		System.out.println(l.get(4));
//		System.out.println(l.get(5));
	//	System.out.println(l);
//		
		//key one null accept,value n null unlimit accept
//		Map<Integer,String> mp=new HashMap<>(); 
//			mp.put(null, null);
//			mp.put(90, null);
//			mp.put(80, null);
//			mp.put(null, "mani");
//			System.out.println(mp);
//		
//		// key and value does not allow null and insertion order
//		Map<Integer,String> mp=new Hashtable<>(); 
//		mp.put(null, null);
//		mp.put(90, "mani");
//		System.out.println(mp);
		//one null accept
//		Set<Integer> s=new LinkedHashSet<>();
//		s.add(null);
//		s.add(10);
//		s.add(null);
//		s.add(20);
//		s.add(null);
//		s.add(50);
//		s.add(20);
//		s.add(70);
//		s.add(40);
//		
//		System.out.println(s);
		
		//one null allowed and random order
//		Set<Integer> s=new HashSet<>();
//		s.add(null);
//		s.add(2);
//		s.add(null);
//		s.add(10);
//		s.add(60);
//		
//		s.add(90);
//		s.add(60);
//		s.add(null);
//		s.add(80);
//		
//		System.out.println(s);
//		//ignore null values and order of execution ascending order
		Set<String> s=new TreeSet<String>();
		
		s.add("%");
		s.add("6"); 
		s.add(",");
		s.add("A");
		s.add("a");
		s.add("90");
		s.add(" ");
		s.add("z");
		
		System.out.println(s);
		
//		32...space
//		33 to 47....spl character
//		48 to 57...0 to 9
//		65 to 90...A to Z
//		97 to 122  ..a to z
	}
	

}
