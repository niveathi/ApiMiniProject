package com.variables;

public class Variables {
	String s="Class Variable";
	static int j=30;
	private void localVariable() {
		int i = 20;
		System.out.println(i);
	}
	public void localVariable2() {
		int i=69;
		System.out.println(i);
	}
	protected void localvariable3() {
		int i=12;
		System.out.println(i);
	}
	void localVariable4() {
		int i=45;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Variables v=new Variables();
		v.localVariable();
		v.localVariable2();
		v.localvariable3();
		v.localVariable4();
		System.out.println(v.s);
		System.out.println(j);
	}

}
 