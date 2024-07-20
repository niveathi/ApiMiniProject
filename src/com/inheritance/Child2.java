package com.inheritance;

public class Child2 extends GrandChild {
	public void bike() {
	System.out.println("Himalayas RE");
}
	public void laptop() {
		super.laptop();

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
		Child2 c=new Child2();
		c.bike();
		c.laptop();
		c.land();
		c.car();
		c.watch();
	}
}
