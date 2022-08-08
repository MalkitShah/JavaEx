package com.qa.helloworld;

public class HelloWorld {
	// main method- is the starting point of the application 
	// Shortcut to write it: type "main" then hit ctrl+space
	public static void main(String[] args) {
		//print statements
		//shortcut to write a print line: type "sysout" then ctrl+space
		System.out.println("Hello World");
		System.out.println("Welcome to my first program while being at ATOS");
		System.out.println("lovely");
		
		// Create an instance of the class we want to run 
		Hello a = new Hello();
		a.hello();
		System.out.println(a.hello2());
	
	}

}

