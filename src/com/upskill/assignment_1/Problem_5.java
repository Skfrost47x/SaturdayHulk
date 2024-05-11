package com.upskill.assignment_1;

public class Problem_5 {
/*Write a java program which will display name and estimated age of every students in your class.
(write separate method for every student). */
	
	public static void main(String[] args) {
		
		Problem_5 myObj = new Problem_5();
		myObj.Student_1();
		
		Student_2();
		
		int a = Student_3();
		System.out.println("Age of Z is " +a);
	}

	public void Student_1(){
		int a = 32;
		System.out.println("Age of X is " +a);
	}
	public static void Student_2() {
		int a = 35;
		System.out.println("Age of Y is " +a);
	}
	public static int Student_3(){
		int a = 37;
		return a;
	}
}
