package com.java8.interfacemethods;

public class StaticMethods implements MyInterface {
	public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public static void main(String[] args) {  
    	StaticMethods obj = new StaticMethods();
    	
        obj.newMethod();    
        MyInterface.anotherNewMethod();
        obj.existingMethod("Java 8 is easy to learn");  
  
    }  
}