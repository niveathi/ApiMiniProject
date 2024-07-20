package com.inheritance;

public class GrandChild extends Child {
	public void laptop() {
		System.out.println("Mac");

	}
	public void land() {
		super.land();
}
	public void car() {
		super.car();
}
	public void watch() {
		super.watch();
}
	public static void main(String[] args) {
		GrandChild gc=new GrandChild();
		gc.laptop();
		gc.land();
		gc.car();
		gc.watch();
	}
}
