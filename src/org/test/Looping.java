package org.test;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
//		quiz1
//		for(int i=0; i<=100; i++) {
//			if(i==5) {
//				System.out.println(i);
//			}
//		
//		}
		
	//quiz2	
		
//		for(int i=1; i<=10; i++) {
//			if(i==7) {
//				break;
//			}
//			System.out.println(i);
//		}
//		
		//quiz3
		
//		for(int i=1; i<=10; i++) {
//			if(i==7) {
//				continue;
//				
//			}
//			System.out.println(i);
//		
//		}
		
//	//	quiz4
//		for(int i=1 ; i<=3; i++) {
//			for(int j=1; j<=3; j++) {
//				System.out.println(j);
//			}
//		}
//		
		//quiz5
//		 for (int i = 1; i <= 3; i++) {
//		      for (int j = 1; j <= 3; j++) {
//		        System.out.println(i);
//		      }
//
//		    }
//    for (int i = 1; i <= 3; i++) {
//    for (int j = 1; j <= i; j++) {
//      System.out.println(j);
//    }
//
//  }  
//QU 6(o/p==2,3,3
//		 for (int i = 1; i <= 3; i++) {
//		      for (int j = i + 1; j <= 3; j++) {
//		        System.out.println(j);
//		      }
//
////		    }
//		  for (int i = 1; i <= 3; i++) {
//		      for (int j = i + 1; j <= i; j++) {
//		        System.out.println(j);
//		      }
//
//		    }
	

//		 int i=5;
//	      if (i == 5) {
//	        break;
//	      }
//	      System.out.println(i);
	  
//
//	
//		
//
//}	
//		
//}
//
//		
		
//		 for( int i=1; i<=15; i=i+1){
//	      System.out.println(i);
//	      
//	  }
//
//		int counter;
//		for(counter=1; counter<10; counter++) {
//			if(counter==3) {
//				System.out.println("@");
//			}
//			System.out.print("#");
//		}
	//	decreasing pattern
//		int n=5;
//		for(int i=1; i<=n;i++) {
//			for(int j=i; j<=n; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//increasing pattern
//		int n=5;
//		for( int i=1; i<=n ; i++) {
//			for (int j=1; j<=i; j++) {
//				System.out.print("&");
//			}
//			System.out.println();
//		}
		//right side triangel
//		int n=5;
//		for(int i=1; i<=n ; i++) {
//			for (int j=i; j<=n-1;j++) {
//				System.out.print("  ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//	System.out.println();		
//		}
//   1...eligible not eligible
//		System.out.println("enter your age?");
//		Scanner s=new Scanner(System.in);
//		int ni = s.nextInt();
//		int i=ni; 
//			if(i>=18) {
//			System.out.println("Eligible");
//		}
//			else {
//			System.out.println("Not eligible");
//		}
//	2..	odd or Even
//		System.out.println("enter your number?");
//		Scanner s=new Scanner(System.in);
//		int ni = s.nextInt();
//		int i=ni;
//		if(i%2==0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("odd");
//		}
	//3..print even number 1 to 100
//		for(int i=1; i<=150;) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//			i=i+1;
//		}
//4.find sum of odd numbers 1 to 100
//		int sum=0;
//		for(int i=1; i<=100;) {
//			if(i%2!=0) {
//				sum=sum+i;
//			}
//			i++;
//		}
//		System.out.println(sum);
		
	//	4.1.find sum of even number 1 to 100
		
//		int sum=0;
//		for (int i=1;i<=100;) {
//			if(i%2==0) {
//				sum=sum+i;
//			}
//			i++;
//		}
//		System.out.println(sum);
		//task
		int n=10;
		for (int i = 0; i < n; i++) {
			for (int j = i; j <n-1 ;j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		int n=5;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <i+1 ; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
}
}