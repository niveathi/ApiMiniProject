package com.keyword;

public class Keyword {
	static int i=10;
	int z=100;
	private static void staticMethod() {
		System.out.println("STATIC");
	}
	private void finalKeywordInVariableLevel() {
		String s="Final Keyword";
//		s="Final";
		System.out.println(s);
		System.out.println(this.z);
	}
	public final void finalKeywordMethodLevel() {
		System.out.println("FINAL");
	}
	private int returnMethod() {
		int v=89;
		return v;
	}
	private int returnMethod2() {
		int v2=91;
		return v2;
	}
	public static void main(String[] args) {
		Keyword k=new Keyword();
    	k.staticMethod();
		staticMethod();
		System.out.println(i);
		k.finalKeywordInVariableLevel();
		k.finalKeywordMethodLevel();
		System.out.println(k.returnMethod() + k.returnMethod2());
		
		
	}
} 
