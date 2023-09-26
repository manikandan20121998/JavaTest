package org.test;

public class Client extends Constructor{
  
	public Client() {//1
       this ("kalai");
      System.out.println("default");
	}
	public Client(int id) {
		this();
		System.out.println("int"+id);
	}
	public Client(String name) {//2
		super("sera");
		System.out.println("string "+name);
	}
	public static void main(String[] args) {
		new Client(2342);
	}
	
	
	
	
	
	
}
