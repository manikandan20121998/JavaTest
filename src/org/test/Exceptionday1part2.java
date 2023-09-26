package org.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exceptionday1part2 {

	public static void main(String[] args) throws IOException {
		
		//IO exception
		File f=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\JavaTest\\Exception");
		f.createNewFile();
		
		
		//Number format Exception
		
//		String s="1000Rupees";
//		//System.out.println(s+500);
//		int parseInt = Integer.parseInt(s);
//		System.out.println(parseInt+500);
//		
		//Input mismatch exception
//		 // Runtime i give string value instead of Int value
//		Scanner so=new Scanner(System.in);
//		int ni = so.nextInt();
//		System.out.println(ni);
//		
		//Index outofBound Exception
		List<Integer> li=new ArrayList<>();
		li.add(18);
		li.add(242);
		System.out.println(li.get(2));
		
		//arrayindexoutof bound exception
		
		int a[]=new int[2];
		a[0]=17;
		a[1]=39;
		a[2]=89;
		System.out.println(a[6]);
		
		
		//Nullpointer exception
		String s2=null;
		System.out.println(s2.length());
		
		//String index outof bound exception
		
		String s4="Welcome";
		
		System.out.println(s4.charAt(8));
		
		//Arithmetic Exception
		
		System.out.println(0);
		System.out.println(20);
		System.out.println(30/0);
		System.out.println(39);
		
		
	}

}
