package org.test;

import java.util.LinkedList;
import java.util.List;

public class Exception2 {

	public static void main(String[] args) {
		
		System.out.println("try with in try");
		System.out.println("start");
		try {
			List<Integer> li=new LinkedList<>();
			li.add(19);
			System.out.println(li.get(0));
			try {
				String s="hai";
				System.out.println(s.charAt(4));
			}
		
		catch(NullPointerException ex) {
			System.out.println("inner catch");
			
		}
		finally {
			System.out.println("innerfinally");
		}
		}
		catch(IndexOutOfBoundsException ex) {
			System.out.println("outer catch");
		}
		finally {
			System.out.println("outer finally");
		}
		System.out.println("end");

		
	}

}
