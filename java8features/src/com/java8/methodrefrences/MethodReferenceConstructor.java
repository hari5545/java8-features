package com.java8.methodrefrences;

public class MethodReferenceConstructor {
	
	@FunctionalInterface 
	private interface MyInterface{  
		Hello display(String say);  
	}  

	public static void main(String[] args) { 
		//Method reference to a constructor
		MyInterface ref = Hello::new;  
		ref.display("Hello World!");  
	}  
}
 