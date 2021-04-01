package com.java.demo;

public class StudentDetails {
	public void studentName() {
		System.out.println("Student name is Keerthi");
		
	}
	public void studentId() {
		System.out.println("Student id is 22");
		
	}
public void studentStd() {
	System.out.println("Student std is 12th");
	
}
public static void main(String[] args) {
	//className objectName = new className();
	StudentDetails o = new StudentDetails();
	o.studentName();
	o.studentId();
	o.studentStd();
	
}
}
