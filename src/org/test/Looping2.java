package org.test;

import java.math.BigInteger;
import java.util.Scanner;

public class Looping2 {

	public static void main(String[] args) {
		//5.count of even number 1 to 100
//		int count=0;
//		for (int i=1; i<=100;) {
//			if(i%2==0) {
//				count++;
//			}
//			i++;
//		}
//		System.out.println(count);
		//6.To find factorial number
//		int factorial=1;
//		long ln=(long)factorial;
//		System.out.println("enter the number");
//		Scanner s=new Scanner(System.in);
//		int ni = s.nextInt();
//		
//		for(int i=ni; i>=2; i--) {
//			ln =ln*i;
//		}
//		System.out.println(ln);
//		
		//7.print reverse order series 100 to 0
		
//		for (int i=100; i<=100;i--) {
//			System.out.println(i);
//			if(i==0) {
//				break;
//			}
//			
//		}
		
		//7 print fibonacci series order 1 to 100
//	int	first=0, second=1;
//	for(int i=0; i<=100; i++) {
//		System.out.println(first);
//		if(first==89) {
//			break;
//		}
//	int	third=first+second;
//		first=second;
//		second=third;
//	}
		//8.find prime number or not
	//	way1
//		int a=12;
//		boolean b = BigInteger.valueOf(a).isProbablePrime(1);
//		System.out.println(b);
		
		
		
		//way2	
//		int i,j;
//		for(i=1;i<=100;i++) {
//			for(j=2;j<i;j++) {
//				if(i%j==0) {
//					break;
//				}
//				
//				}
//			if(i==j) {
//				System.out.println(i);
//			}
//		}
		// way best 3
//		System.out.println("enter the number");
//		Scanner s=new Scanner(System.in);
//		int ni = s.nextInt();
//		
//		int j;
//		for(int i=ni;i<100;) {
//			for(j=2;j<i;j++) {
//				if(i%j==0) {
//					break;
//				}
//		}
//			if(i==j) {
//		System.out.println("its prime");	
//		break;
//	}
//			else {
//				System.out.println("it is not prime number");
//				break;
//			}
//		}
		//Reverse number	
//	int	no = 123456789;
//		int rem=0;
//		while(no>0) {
//			rem=(rem*10)+no%10;
//			no=no/10;
//		}		
//		System.out.println(rem);
		
		//count of the number
//		int n=73837704;
//		int count=0;
//		while(n>0) {
//			n=n/10;
//			count=count+1;
//		}
//		System.out.println(count);
		
		//sum of numbers
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int ni = s.nextInt();
		int n=ni;
		int sum=0;
		while(n>0) {
			int temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		System.out.println(sum);
		
		//palindrom find
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter the word");
//		String nt = s.nextLine();
//		String x=nt;
//		int i=0,j=x.length()-1;
//		while(i<j) {
//			if(x.charAt(i)!=x.charAt(j)) {
//				System.out.println("not palindrom");
//				System.exit(0);
//			}
//			i++;
//			j--;
//		}
//		System.out.println("its palindrome");
		//Armstrong number or not
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter the number");
//		int ni = s.nextInt();
//		int n=ni;
//		int temp,Armstrong=0;
//		int original=n;
//		while(n>0) {
//			temp=n%10;
//			temp=(int) Math.pow(temp, 3);
//			Armstrong=Armstrong+temp;
//			n=n/10;
//		}
//		if(Armstrong ==original) {
//			System.out.println("Armstrong");
//		}
//		else {
//			System.out.println("not armstrong");
//		}
		//pattern number
//		int row=7;
//		for(int i=1;i<=7; i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		//pattern *
		for(int i=1;i<=7; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
