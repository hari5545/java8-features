package com.java8.interfacemethods;

public interface MyInterface {
	default void newMethod(){  
		System.out.println("Newly added default method");  
	}  
	void existingMethod(String str);  
	static void anotherNewMethod(){
    	System.out.println("Newly added static method");
    }
}
