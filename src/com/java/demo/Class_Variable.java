package com.java.demo;

public class Class_Variable {
	int b = 20;
	public void test() {
		int a = 10;
		System.out.println(a);
		System.out.println(b);
		}
	
	public static void main(String[] args) {
		Class_Variable cv = new Class_Variable();
		cv.test();
				}

}
