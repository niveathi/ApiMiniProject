package com.inheritance;

public class Child extends Parent{
	public void watch() {
		System.out.println("Rolex");
	}
	public void land() {
		super.land();
}
	public void car() {
		super.car();
}
	public static void main(String[] args) {
		Child c=new Child();
		c.watch();
		c.land();
		c.car();
	}
}
