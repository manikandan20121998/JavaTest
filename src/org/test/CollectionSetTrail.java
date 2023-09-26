package org.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSetTrail {
	
	public static void main(String[] args) {
		
		//create new set
		Set<Integer> si=new LinkedHashSet<>();
		
		si.add(10);
		si.add(20);
		si.add(30);
		si.add(40);
		si.add(50);
		si.add(60);
		si.add(70);
		si.add(50);
		si.add(10);
		si.add(20);
		
		System.out.println(si);
		
		//size
		
		int size = si.size();
		System.out.println(size);
		
		//value present or not
		
		boolean contains = si.contains(70);
		System.out.println(contains);
		
		//remove
		si.remove(70);
		System.out.println(si);
		
		//clear
//		si.clear();
//		System.out.println(si);
	
		//get all values
		System.out.println("Enhanced forloop");
		for (Integer x:si) {
			System.out.println(x);
		}
		
		System.out.println("foreach method");
	//	si.forEach(System.out::Println);
		
		//create new list
		List<Integer> li=new ArrayList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(20);
		li.add(30);
		li.add(10);
		
		System.out.println(li);
		
		//create new set
		
		Set<Integer> s2=new LinkedHashSet<>();
		s2.addAll(li);
		
		//equal or not
		boolean equals = s2.equals(li);
		System.out.println(equals);
		System.out.println(s2);
		
		//duplicates count
		
		System.out.println(li.size()-s2.size());
		
		//create new set
	Set<Character> s3=new TreeSet<>();
	
	s3.add('A');
	s3.add('a');
	s3.add('%');
	s3.add('5');
	s3.add(' ');
	System.out.println(s3);
			
		
	}

}
