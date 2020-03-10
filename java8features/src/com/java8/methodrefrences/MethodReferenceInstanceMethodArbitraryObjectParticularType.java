package com.java8.methodrefrences;

import java.util.Arrays;

public class MethodReferenceInstanceMethodArbitraryObjectParticularType {
	public static void main(String[] args) {
		String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
		
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for(String str: stringArray){
			System.out.println(str);
		}
	}
}
