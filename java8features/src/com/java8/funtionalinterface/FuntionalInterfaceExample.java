package com.java8.funtionalinterface;

public class FuntionalInterfaceExample {
	public static void main(String[] args) {
      Calculator cal=(a,b)->{
    	  return a+b;
      };
      System.out.println(cal.add(10, 20));
	}
	
	@FunctionalInterface
	private interface Calculator{
		public int add(int a,int b);
	}
}
