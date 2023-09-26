package org.test;

public class LoopingPattern {

	public static void main(String[] args) {
		
		System.out.println("pattern");
		//left side pattern number
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		// left side pattern symbol of*
		
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		// leftside pattern with symbol of  *and$
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i+1; j++) {
				if(i%2==0) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("$"+" ");
				}
			}
			System.out.println();
		}
		
		//Right hand triangle
		int row=5;
		for (int i = 0; i < row; i++) {
			for (int k = 2*(row-i); k>=0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print(" "+"*");
			}
			System.out.println();
		}
		System.out.println("pyramid");
		for (int i = 0; i < row; i++) {
			for (int k = row-i; k>=0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print(" "+"*");
			}
			System.out.println();
		}
	//	System.out.println();
		//bottom pyramid
		for (int i = 0; i < row; i++) {
			for (int k = 0; k<i+1 ; k++) {
				System.out.print(" ");
			}
			for (int j = row-i; j >0; j--) {
				System.out.print(" "+"*");
			}
			System.out.println();
		}
		System.out.println("my try");
		System.out.println("try this way");
		int my=10;
		for (int i = 0; i <my; i++) {
			for (int k = 0; k <my-i ; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <=i ; j++) {
				System.out.print(" "+"*");
			}
			System.out.println();
		}
		//print abcd to z
		for (int i = 'A'; i <= 'Z'; i++) {
			char z=(char)i;
			System.out.print(" "+z);
		}
		System.out.println();
		for (int i = 'a'; i <='z'; i++) {
			char a=(char)i;
			System.out.print(a+" ");
		}
		System.out.println();
		int m=65;
		char n=65;
		int v='A';
		System.out.println(m);//65
		System.out.println(n);//A
		System.out.println(v);//65
		
		int a=10;
		int b=20;
		System.out.println("before swap.."+a);
		System.out.println("before swap"+b);
		int c=0;
		c=a;//10
		a=b;//20
		b=c;//10
		System.out.println("after swap"+a);//20
		System.out.println("after swap"+b);//10
		System.out.println("after swap"+c);//10
		
		//swaping without 3rd variable
		
		int a1=10;
		int b1=20;
		int c1=30;
		System.out.println("before swap.."+a1);
		System.out.println("before swap"+b1);
		a1=a1+b1;//30
		b1=a1+b1;//50
		c1=b1+a1;//80
		System.out.println("after swap"+a1);
		System.out.println("after swap"+b1);
		System.out.println("after swap"+c1);
		
		System.out.println(1);//1
		System.out.println("1");//1
		System.out.println(1+2);//3
		System.out.println("1"+"2");//12
		System.out.println(1+2+3+"4"+5+6);//6456
		System.out.println("1"+2+3+4+5);//12345
		System.out.println("1"+(2+3+4));//19
		
		
		System.out.println("my try greaterthan symbol");
		
		int temp=7;
		for (int i = 0; i <temp; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(" "+"*");
			}
			System.out.println();
		}
		for (int k = 0; k <temp; k++) {
			for (int i = 0; i <temp-k ; i++) {
				System.out.print(" "+"*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("my try lessthan symbol");
		
		int maddy=7;
		for (int i = 0; i < maddy; i++) {
			for (int j = 0; j <maddy-i ; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int l = 0; l <maddy ; l++) {
			for (int i = 0; i < l+1; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < maddy-l; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
