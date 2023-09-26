package org.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayInterviewTask {
	public static void main(String[] args) {
	
		int a1a[][]= {{50,80,90,75,90,10},{45,67,88,35,67,90}};
		System.out.println(a1a[1][1]);
		int a[]= {50,80,90,75,90,10};
		System.out.println("["+a[2]+"]");
		//iteration
		for (int i : a) {
			System.out.print(i+" ");
		}
		Arrays.sort(a);
		System.out.println();
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Acending order");
		
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
			
			System.out.println("maximum value"+a[a.length-1]);
			System.out.println("second maximum value"+a[a.length-3]);
			System.out.println("minimum value"+a[0]);
			System.out.println("second min value"+a[1]);
		}
		System.out.println("decending order");
		int temp1=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					temp1=a[i];
					a[i]=a[j];
					a[j]=temp1;
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("min value"+a[a.length-1]);
		System.out.println("second min value"+a[a.length-2]);
		System.out.println("max value"+a[0]);
		System.out.println("second max value"+a[2]);
		
		//without sort take max value
		int b[]= {20,67,82,223,32,13,12};
		int max=b[0];
		for (int i : b) {
			if(max<i) {
				max=i;
			}
		}
			System.out.println("maximum" +" "+max);	
			//second maximum value
			int max2=b[0];
			for (int i : b) {
				if(max2<i&&i!=max) {
					max2=i;
				}
			}
			System.out.println("2nd maximum value"+max2);
			
		//min value
			int b1[]= {20,67,82,223,32,13,12};
			int min=b[0];
			for (int i : b1) {
				if(min>i) {
					min=i;
				}
			}
				System.out.println("minimum" +" "+min);	
			//second minimum value
		int min2=b1[0];
		for (int i : b1) {
			if(min2>i&&i!=min) {
				min2=i;
			}
		}
		System.out.println("2nd minimum value"+min2);
		
		//Array size is fixed
		int[] q=new int[4];
		q[0]=30;//0
		q[1]=67;//1
		q[2]=87;//2
		q[3]=13;//3
	//size fixed	q[4]=78;
		for (int i : q) {
			System.out.println(i);
		}
		//Array to List
		Integer w[]= {43,54,32,24,12,56,77};
		List<Integer> list = Arrays.asList(w);
		System.out.println(list);
		Collections.max(list);
		Collections.min(list);
		//List to Array
		List<Integer> e=new LinkedList<>(Arrays.asList(62,44,23,4523,433,53,90));
		System.out.println(e);
		
		List<Integer> r=new LinkedList<>();
		r.add(32);
		r.add(42);
		r.add(776);
		r.add(56);
		r.add(909);
		r.add(4654);
		
		Object[] t = r.toArray();
		for (Object o : t) {
			System.out.print(o+" ");
		}
		System.out.println();
		//duplicate remove from array
		//using set
		Integer y[]= {12,33,34,41,3,341,12,33,3};
		List<Integer> list2 =Arrays.asList(y);
		System.out.println(list2);
		Set<Integer> s=new LinkedHashSet<Integer>();
		s.addAll(list2);
		System.out.println(s);
		
		//Using array itself              
		Arrays.sort(y);
		for (Integer integer : y) {
			System.out.print(integer+" ");
		}
		System.out.println();
		int u=0;
		int z=y.length;
		for (int i = 0; i < z-1; i++) {
			if(y[i]!=y[i+1]) {
				y[u++]=y[i];
			}
		}
		y[u++]=y[y.length-1];
		z=u;
		for (int i=0; i<z; i++) {
			System.out.print(y[i]+" ");
		}
		System.out.println();
		//join the array
		int a1[]= {1,2,8,6};
		int a2[]= {6,8,9,5};
		int a3[]= {4,7,2,44};
		
		int t1=a1.length+a2.length+a3.length;
		int z1[]=new int[t1];
		
		for (int i = 0; i < a1.length; i++) {
			z1[i]=a1[i];
		}
		for (int i = 0; i < a2.length; i++) {
			z1[a1.length+i]=a2[i];
		}
		for (int i = 0; i < a3.length; i++) {
			z1[a1.length+a2.length+i]=a3[i];
		}
		
		for (int z2 : z1) {
			System.out.print(z2+" ");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
