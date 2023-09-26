package org.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringInterviewTask {

	public static void main(String[] args) {

//		//Reverse
//		String s= "welcome";
//		StringBuffer s1=new StringBuffer(s);
//		StringBuffer reverse = s1.reverse();
//		System.out.println(reverse);
//		
//		//using loop
//		String ss="";
//		for (int i = s.length()-1; i>=0 ; i--) {
//			char charAt = s.charAt(i);
//			ss=ss+charAt;
//		}
//		System.out.println(ss);
//		
//		//palindrom
//		String sp="malayalam";
//		String spp="";
//		for (int i = sp.length()-1; i >=0; i--) {
//			char charAt = sp.charAt(i);
//			spp=spp+charAt;
//		}
//		System.out.println(spp);
//		if(spp.equals(sp)) {
//			System.out.println("its palindrom");
//		}
//		else {
//			System.out.println("its not palindrom");
//		}
//		
//		//equals check value == checks memory address value
//		String a="hello";
//		String b="hello";
//		String c="hai";
//		String d=new String("hello");
//		String e=new String("hello");
//		System.out.println(a.equals(b));//t
//		System.out.println(a.equals(c));//f
//		System.out.println(a.equals(d));//t
//		System.out.println(a.equals(e));//t
//		System.out.println(a==b);//t
//		System.out.println(a==c);//f
//		System.out.println(a==d);//f
//		System.out.println(e==d);//f
//		
//		//count of letters
//		String s2="hellloosddsmdhhhhh";
//		char[] ss2 = s2.toCharArray();
//		Map<Character,Integer> mp=new LinkedHashMap<>();
//		
//		for (char x : ss2) {
//			if(mp.containsKey(x)) {
//				Integer ct = mp.get(x);// get that value
//				mp.put(x, ct+1);
//			}
//			else {
//				mp.put(x, 1);
//			}
//		}
//		System.out.println(mp);
//		
//		//print duplicates
//		String dp="";
//		String dpp="";
//		Set<Entry<Character, Integer>> es = mp.entrySet();
//		for (Entry<Character, Integer> x : es) {
//			if(x.getValue()>1) {
//				Character key = x.getKey();
//				dp=dp+key;
//			}
//			else {
//				//not a duplicates
//				Character key = x.getKey();
//				dpp=dpp+key;
//			}
//		}
//		System.out.println("duplicate======="+dp);
//		System.out.println("not a duplicate======"+dpp);
		
//		//count of words
//		String s4="hello welcome to my class of class to hello my world";
//		String[] s4p = s4.split(" ");
//		
//		Map<String,Integer> mp1=new LinkedHashMap<>();
//		for (String s4pp : s4p) {
//			if(mp1.containsKey(s4pp)) {
//				Integer ct = mp1.get(s4pp);
//				mp1.put(s4pp, ct+1);
//			}
//			else {
//				mp1.put(s4pp, 1);
//			}
//		}
//		System.out.println(mp1);
		
//		//reverse sentence(letters)
//		System.out.println("..........reverse sentence with letterwise");
//		String s1s="welcome to my future of software field";
//		String s2s="";
//		System.out.println(s1s.length());
//		
//		for (int i = s1s.length()-1; i >=0; i--) {
//			s2s=s2s+s1s.charAt(i);
//		}
//		System.out.println(s2s);
//		String sp01="";
//		//sentence reverse
//		System.out.println("..............Sentence reverse");
//		String[] sp0 = s1s.split(" ");
//		
//		for (int i = sp0.length-1; i >=0; i--) {
//			sp01=sp01+sp0[i]+" ";
//		}
//		System.out.println(sp01);
		
//		//reverse the word same place itself
//		System.out.println(".......reverse the word same place itself.....");
//		
//		String m="manikandan maddy on software";
//		String ma="";
//		String[] man = m.split(" ");
//		System.out.println(man.length);
//		for (int i = 0; i < man.length; i++) {
//			String re = man[i];
//			for (int j = re.length()-1; j >=0; j--) {
//				ma=ma+re.charAt(j);
//			}
//		ma=ma+" ";
//			}
//		System.out.println(ma);
//		
//		//vowels
//		String p="manikAndanwedspunItHa";
//		String p1="";
//		int p11=0;
//		String p2="";
//		int p22=0;
//		char[] pp = p.toCharArray();
//		for (char f : pp) {
//			if(f=='a'|f=='e'|f=='i'|f=='o'|f=='u'||f=='A'|f=='E'|f=='I'|f=='O'|f=='U'){
//				p1=p1+f;
//				p11++;
//			}
//			else {
//				p2=p2+f;
//				p22++;
//			}
//		}
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p11);
//		System.out.println(p22);
//		
//		//print duplicate and not duplicate
//		String q="manikandanvajra";
//		String q1="";
//		String q2="";
//		char[] q11 = q.toCharArray();
//		for (char f : q11) {
//			if(!q1.contains(String.valueOf(f))) {
//				q1=q1+f;
//			}
//			else {
//				q2=q2+f;
//			}
//		}
//		System.out.println("not duplicate====="+q1);//not duplicate
//		System.out.println("duplicate====="+q2);//duplicate
		
//		//remove duplicate word
//		String z="mani is one of the one is word of man world software";
//		String z1="";//not duplicate
//		String z2="";// duplicate
//		String[] zs = z.split(" ");
//	    for (String x : zs) {
//			if(!z1.contains(x)) {
//				z1=z1+x+" ";
//			}
//			else {
//				z2=z2+x+" ";
//			}
//		}
//		System.out.println(z1);
//		System.out.println(z2);
//		
//		
	//palindrom
//		String pa="madam";
//		String pali="";
//		for (int i = pa.length()-1; i >= 0; i--) {
//			char ct = pa.charAt(i);
//			pali=pali+ct;
//		}
//		System.out.println(pali);
//		if(pali.equals(pa)) {
//			System.out.println("palindrom");
//		}
//		else {
//			System.out.println("not palindrom");
//		}
		
//		//pattern
//		for (int i = 0; i < 7; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		//Reverse
//		String s="Reverse";
//		String s1="";
//		for (int i = s.length()-1; i >=0; i--) {
//			char ct = s.charAt(i);
//			s1=s1+ct;
//		}
//		System.out.println(s1);
		//Reverse Gear
//		String s="Reverse Gear";
//	    String s1=" ";
//	    for (int i = s.length()-1; i >= 0; i--) {
//			char ct = s.charAt(i);
//			s1=s1+ct;
//		}
//		System.out.println(s1);
		
		//Reverse lineitself
		String s="Reverse gear line itself";
		String ss=" ";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			String st = split[i];
			for (int j = st.length()-1; j >=0 ; j--) {
				char ct = st.charAt(j);
				ss=ss+ct;
			}
			ss=ss+" ";
		}
		System.out.println(ss);
		
		
		
		
		
		
		
		
	}

}
