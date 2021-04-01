package com.javaS.demo;

public class Dance_ClassCont extends Dance_Class{
	@Override
	public void boyName(String s) {
			super.boyName("Dinesh");
			System.out.println("The boy name is " +s);
	}
	@Override
	public void girlname(String s, char c) {
	super.girlname("Priya" , 'D');
	System.out.println("The girl name is " +s +"." +c);
	}
	public static void main(String[] args) {
		Dance_ClassCont dc = new Dance_ClassCont();
				dc.boyName("Suresh");
				dc.girlname("Kavya", 'C');
	}

}
