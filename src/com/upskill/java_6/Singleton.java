package com.upskill.java_6;

public class Singleton {
	
	// Singleton is class that can have only one object
	
	//private constructor, it prevents any other class from instantiating
	private Singleton(){
		
	}
	
	//Private static object of the class
	private static Singleton singletonobj = new Singleton();
	
	public static Singleton getInstance(){
		return singletonobj;
	}
	
	protected static void demo(){
		System.out.println("Demo method for singleton class");
	}
	
	protected static void demo2(){
		System.out.println("Demo 2 method for singleton class");
	}
	
	protected static void demo3(){
		System.out.println("Demo 3 method for singleton class");
	}
	
}
