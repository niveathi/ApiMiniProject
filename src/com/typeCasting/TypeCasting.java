package com.typeCasting;

public class TypeCasting {
	
	public void method1() {
		System.out.println("METHOD1");
	}
	public static void main(String[] args) {
		byte b=20;
//		short s=b;
		short s1=(short)b;
		System.out.println(s1);
		
		long l=363749l;
		int i=(int)l;
		System.out.println(i);
	}

}
