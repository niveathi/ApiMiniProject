package com.string;

public class StringTypes {
	public static void main(String[] args) {
		//Immutable
		String s = "Java";
		String s2 = "Java";
		System.out.println(s);
		System.out.println(System.identityHashCode(s)); 
		System.out.println(System.identityHashCode(s2));
		
		
		String s3=s.concat(s2);
		System.out.println(s3);
		System.out.println(System.identityHashCode(s3));
		
		System.out.println("=================");
		
		//Mutable
		StringBuffer sb =new StringBuffer("Selenium");
		StringBuffer sb2 =new StringBuffer("Selenium");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(System.identityHashCode(sb2));
		
		StringBuffer sb3=sb.append(sb2);
		System.out.println(sb3);
		System.out.println(System.identityHashCode(sb3));
		
		System.out.println("=================");
		
		StringBuilder a =new StringBuilder("Testing");
		StringBuilder a2 =new StringBuilder("Testing");
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(a2));
		
		StringBuilder a3 =a.append(a2);
		System.out.println(a3);
		System.out.println(System.identityHashCode(a3));
	}

}
 