 package com.collectionEx;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(10);
		l2.add(20);
		
		l.addAll(l2);
		System.out.println(l);
		
//		l.retainAll(l2);
//		System.out.println(l2);
		
		l.removeAll(l2);
		System.out.println(l);
	}

}
