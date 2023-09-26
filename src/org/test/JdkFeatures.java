package org.test;

public class JdkFeatures {
public static void sum(int... a) {
System.out.println(a);
}
	

	public static void main(String[] args) {
		sum(10, 20,40,39,30,20);
		
		System.out.println(".............jdk1.5 and 1.7 features.........");
		int a=10;
		Integer b=a;
		Integer b1=new Integer(a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(b1);

		try {
			System.out.println("hai");
			System.out.println(4/0);
		}
		//System.out.println("mani");//try and catch between not able to give anything
		catch(NullPointerException|ArithmeticException|StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println("heloo");
		}
		long l=100_00_00_000;
		System.out.println(l);
	}

}
