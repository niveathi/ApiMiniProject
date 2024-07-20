package com.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exceptions {
	public static void main(String[] args) {
		
		//Arithmetic
		int g=100;
//		System.out.println(g/0);
		System.out.println(g);
		
		//Null Pointer exception
		Set<Integer> s=new TreeSet<Integer>();
		s.add(100);
	//	s.add(null);
		
		//Input Mismatch
//		Scanner sc=new Scanner(System.in);
//		int nextInt = sc.nextInt();
//		System.out.println(nextInt);
		
		//Array index Out of Bound
		int a[] = {1,2,3,4};
//		System.out.println(a[5]);
		
		//String Index out of Bound
		String st="Hello";
//		System.out.println(st.charAt(6));
		
		//Numberformat Exception
//		String str="1234sddj";
//		int int1 = Integer.parseInt(str);
//		System.out.println(int1);
		
		//Index OutofBound
		List<String> l=new ArrayList<String>();
		l.add("Array");
		l.add("OOPS");
		System.out.println(l);
//		System.out.println(l.get(3));
	}

}
