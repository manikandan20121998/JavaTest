package org.test;

import java.io.IOException;
import java.util.Scanner;

public class Exception2part2 {
	
	//for example throw and throws
	public static void product() throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the product name");
		String pr = s.next();
		if(pr.equals("iphone")) {
			System.out.println("its available");
		}
		else {
			System.out.println("not available");
			throw new IOException();
		}
		System.out.println("end");
	}
	public static void main(String[] args) throws IOException {
		product();	
	}

}
