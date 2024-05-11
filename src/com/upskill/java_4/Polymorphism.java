package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	
/* 	Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overriding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	
	
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	
	
public static void main(String[] args) {
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncome();
		
		car();
		car("Charger");
		car("Charger", 4);
		car(6);

	}

	
public void annualIncome(){
	int rentalIncome = 25000;
	int crypto = 20000;
	int business = 25000;
	int calculateAnnualIncome = hourlyIncome * 2000 + rentalIncome + crypto + business;
	System.out.println(" My Annual Income = " + calculateAnnualIncome);
	
	
}
	//Method Overloading - Compile time Polymorphism - Static binding
	//Same method name with different signature

	public static void car(){							//Method Overloading
		System.out.println("I have a Tesla Car");
	}
	
	public static void car(String turbo){
		System.out.println("I have a Tesla Car, installed with " + turbo);
	}
	
	public static void car(String turbo, int hydrualics){
		System.out.println("I have a Tesla Car, installed with " + turbo + " and " + hydrualics + " hydrualics");
	}
	
	public static void car(int seats){
		System.out.println("I have a Tesla Car, which has " + seats + " seats");
	}
	
}
