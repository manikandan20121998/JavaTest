package org.test;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Enumerationss {

	public static void main(String[] args) {

Vector<Integer> li=new Vector<>(Arrays.asList(10,20,64,92,02,63));
System.out.println(li);
System.out.println("noraml for loop");
//1.Normal for loop
for (int i = 0; i < li.size(); i++) {
	Integer val = li.get(i);
	System.out.println(val);
}
//2. Enhanced for loop
System.out.println(".........enhanced for loop.....");
for (Integer x : li) {
	System.out.println(x);
	
}
//3. for each method
System.out.println(".............for each method...........");
li.forEach(System.out::println);
//4. while loop
System.out.println(".......while loop......");
int i=0;
while(li.size()>i) {
	System.out.println(li.get(i));
	i++;
}
//5.Enumerations
System.out.println(".....enumerator...........");
Enumeration<Integer> e = li.elements();
while(e.hasMoreElements()) {
	Integer it = e.nextElement();
	//remove method notsupported.
//	if(it>50) {
//		e.remove();
//	}
	System.out.println(it);
}
//6.iterator
System.out.println("...........iterator.........");
Iterator<Integer> ir = li.iterator();
while(ir.hasNext()) {
	Integer it = ir.next();
//	if(it>50) {
//		ir.remove();
//	}
	System.out.println(it);
}
//7.List iterator
System.out.println("........list iterator........");
ListIterator<Integer> lir = li.listIterator();
while(lir.hasNext()) {
	Integer it = lir.next();
//	if(it>50) {
//		lir.remove();
//	}
	System.out.println(it);
}
System.out.println("....reverse.....");
while(lir.hasPrevious()) {
	Integer iti = lir.previous();
//	if(iti>50) {
//		lir.remove();
//	}
	System.out.println(iti);
}
System.out.println(li);













	}

}
