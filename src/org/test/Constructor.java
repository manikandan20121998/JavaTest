package org.test;

public class Constructor {

	public Constructor() {

	this ("sangeetha");
	System.out.println("parent default");
	}

	public Constructor(String name) {//3
       this (66667);
       System.out.println("parent string "+name);
	}

	public Constructor(int id) {//4
		System.out.println("parent int "+id);
	}
	public static void main(String[] args) {
		new Constructor();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
