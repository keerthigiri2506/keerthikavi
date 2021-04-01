package com.java.demo;

public class Reference_Cont extends Reference {
	int a = 20;
	public void test() {
    int a = 30;
    System.out.println("Local Variable " +a);
    System.out.println("Current Class Reference " +this.a);
    System.out.println("Parent Class Reference " +super.a);
}
public static void main(String[] args) {
	Reference_Cont rc = new Reference_Cont();
	rc.test();
}
}
