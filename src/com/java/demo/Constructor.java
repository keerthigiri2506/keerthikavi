package com.java.demo;

public class Constructor {
	public Constructor(int a) {
		System.out.println("My age is 23");

	}

	public Constructor(String s) {
		System.out.println("My name is " + s);
	}

	public static void main(String[] args) {
		Constructor co = new Constructor(23);
		Constructor c = new Constructor("keerthi");
	}
}
