package com.java8.funtionalinterface;

public class ComparableClass {
	public static void main(String[] args) {

		
		Comparable<String> comparable= (c)->{
			return 10;
		};
		int n=comparable.compareTo("0");
		System.out.println(n);
	}
}
