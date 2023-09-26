package org.test;

import java.io.IOException;
import java.util.Scanner;

public class Exception2part3 {
	public static void product() throws IOException, ProductNotFoundException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the product name");
		String pr = s.next();
		if(pr.equals("iphone")) {
			System.out.println("its available");
		}
		else {
			System.out.println("not available");
			throw new ProductNotFoundException();
		}
		System.out.println("end");
	}
 public static void main(String[] args) throws ProductNotFoundException, IOException {
	
	 try {
		 product();
	 }
	 catch(ProductNotFoundException ex) {
		 System.out.println("handle");
		 ex.printStackTrace();
		 String mg = ex.getMessage();
		 System.err.println(mg);
	 }
	 finally {
		 System.out.println("finally");
	 }
	 System.out.println("end");
}
}
