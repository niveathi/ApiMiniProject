package com.collectionEx;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.print.attribute.AttributeSet;
import javax.print.attribute.HashAttributeSet;

public class SetEx {
	public static void main(String[] args) {
		Set<String> set1=new HashSet<String>();
		set1.add("Apple");
		set1.add("Orange");
		set1.add("Watermelon");
		set1.add("Strawberry");
		set1.add(null);
		System.out.println(set1);
		
		Set<Integer> set2=new LinkedHashSet<Integer>();
		set2.add(299);
		set2.add(625);
		set2.add(297);
		set2.add(195);
		set2.add(null);
		System.out.println(set2);
		
		Set<Integer> set3=new TreeSet<Integer>();
		set3.add(90);
		set3.add(70);
		set3.add(10);
		set3.add(20);
//		set3.add(null);
		System.out.println(set3);
		
		
		set2.addAll(set3);
		System.out.println(set2);
		
	   int size = set1.size();
	   System.out.println(size);
	   
//	   Integer integer = set2.get(195);		//get & set method Not working in set 
//	   System.out.println(integer);			//indexOf not working 
	
	   boolean remove = set3.remove(20);
	   System.out.println(set3);
	   
	   boolean contains = set2.contains(297);
	   System.out.println(contains);
	   
	   set3.retainAll(set2);
	   System.out.println(set3);
	   
	   set2.removeAll(set3);
	   System.out.println(set2);
				
	}

}
