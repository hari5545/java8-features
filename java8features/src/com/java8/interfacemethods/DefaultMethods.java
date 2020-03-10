package com.java8.interfacemethods;


public class DefaultMethods implements MyInterface{ 
   
	@Override
	public void existingMethod(String str){           
		System.out.println("String is: "+str);  
	}  
	
	public static void main(String[] args) {  
		DefaultMethods obj = new DefaultMethods();

		obj.newMethod();     

		obj.existingMethod("Java 8 is easy to learn"); 

	}  
}
