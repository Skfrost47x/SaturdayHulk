package com.upskill.java_2;

public class Ifelsestatement {

	public static void main(String[] args) {
		
		int age = 100;
		
		if (age < 13){
			System.out.println("You're a Child");
			
		} else if (age >= 13 && age <18){
			System.out.println("You're a teenager");
		} else if (age >= 60){
			
			if (age >= 100){
				System.out.println("You're an Champion");
			}else {
				System.out.println("You're an Senior");
			}

		}
		else {
			System.out.println("You're an adult");
		}

	}

}
