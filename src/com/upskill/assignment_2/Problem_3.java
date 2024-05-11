package com.upskill.assignment_2;

import java.util.Random;

public class Problem_3 {
/* Problem3. Write two java functions which will return two different integer values,    
	write a program to compare those numbers and send message that one number is bigger than other. 
	(hints: using if..else)*/

	public static int generateNumber_1(){
		Random random = new Random();
		return random.nextInt(100);
	}
	
	public static int generateNumber_2(){
		Random random = new Random();
		return random.nextInt(100);
	}
	
	public static void main(String[] args) {
		 
		int num_1 = generateNumber_1();
		int num_2 = generateNumber_2();
		System.out.println("Number_1 : " +num_1);
		System.out.println("Number_2 : " +num_2);
		
		if (num_1>num_2) {
			System.out.println("Number 1 is bigger than Number 2");
		}else if (num_1<num_2) {
			System.out.println("Number 2 is bigger than Number 1");
		}else {
			System.out.println("Both numbers are equal");
		}
		
	}
	


}
