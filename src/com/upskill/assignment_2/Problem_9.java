package com.upskill.assignment_2;
//Write a Java program to convert temperature from Fahrenheit to Celsius degree.

import java.util.Scanner; //Scanner class from java package to read input from the users

public class Problem_9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter temperature in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		double celsius = (fahrenheit - 32) * 5/9;
		System.out.println("Temperature in Celsius: " +celsius);
		
		input.close();

	}

}
