package com.polymorphism;

public class OverRiding extends OverLoading {
	public void Student() {
		super.student();
	}
	public void student(String a) {
		super.student("Student Name is:"+a);

	}
	public void student(int m,String a2) {
		System.out.println("Roll no:"+m+", "+"Sec:"+a2);

	}
	public void student(String a3,int m2) {
		System.out.println("Sub:"+a3+", "+"Mark:"+m2);

	}
	
	public static void main(String[] args) {
		OverLoading o=new OverLoading();
		o.student();
		o.student("Magizhini");
		o.student(1002,"A");
		o.student("Tamil", 95);
	}
}
