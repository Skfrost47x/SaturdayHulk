package com.upskill.java_1;

public class MethodType {
	

/* 	Types of Methods
	 
	1.Void Method
	2.Static Method
	3.Return Type Method 
	 
 */
	public static int hourlyIncome = 65;
	
	public static void main(String[] args) {
		MethodType myObj = new MethodType();
		myObj.annualIncome();
		
		System.out.println("My monthly Income = " + myObj.monthlyIncomeReturn());
		System.out.println("My Weekly Income = " + myObj.WeeklyIncomeReturn());
		
		WeeklyIncomeStatic();
		returnFunc();
	}

	public void annualIncome(){
		
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println(" My Annual Income = " + calculateAnnualIncome);
		
	}
	
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	
	public int WeeklyIncomeReturn(){
		int calculateWeeklyIncome = hourlyIncome * 40 ;
		return calculateWeeklyIncome;
	}
	
	public static void WeeklyIncomeStatic(){
		String calculateWeeklyIncome = "One Thousand";
		System.out.println(" My Weekly Income = " + calculateWeeklyIncome);
	}
	
	public static boolean returnFunc(){
		boolean lighting = false;
		System.out.println("It is Stormy : " + lighting);
	    return lighting;
	}
}

