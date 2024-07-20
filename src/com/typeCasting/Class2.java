package com.typeCasting;

public class Class2 extends TypeCasting{
	@Override
	public void method1() {
		super.method1();
	}
	
	private void method2() {
		System.out.println("METHOD2");
	}
	public static void main(String[] args) {
//		Class2 c=new Class2();
//		c.method1();	//class2 object creation
//		
//		TypeCasting t=new TypeCasting();
//		t.method1();           //parent class object creation
//		
		TypeCasting t=new Class2();
		t.method1(); 		//UPCASTING
		
//		Class2 c=(Class2) new TypeCasting();
//		c.method1(); 		//DOWNCASTING NOT POSSIBLE
		
		Class2 c=new Class2();
		c.method2();
	}
	
}
