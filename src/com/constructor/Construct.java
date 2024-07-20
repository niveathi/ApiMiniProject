package com.constructor;

public class Construct {
	
	public Construct() {
		this(20);
		System.out.println("Constructor");
	}
	public Construct(int i) {
		this("Mobile", 2000);
		System.out.println(i);
	}
	public Construct(String s,int j) {
		System.out.println(s+j);
	}
	public static void main(String[] args) {
		Construct c=new Construct();
//		Construct c1=new Construct(20);
//		Construct c2=new Construct("Mobile" , 2000);
		  
	}
}
