package com.java.demo;

public class Jumping_Statement {
	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			if (i==6) {
				continue;
			}
			System.out.println(i);
		}
	}

}
