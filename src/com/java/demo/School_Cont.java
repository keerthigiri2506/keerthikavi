package com.java.demo;

public class School_Cont extends School_Exams{

	@Override
	public void Biology() {
System.out.println("Biology percentage is 50%");		
	} 

	public static void main(String[] args) {
		School_Cont sc = new School_Cont();
		sc.Physics();
		sc.Chemistry();
		sc.Biology();
	}
}
