package com.java8.stringjoinnerclass;

import java.util.StringJoiner;

public class StringJoinerMergingTwoStringJoinerObjectsExample {
	public static void main(String[] args) {  
		
		StringJoiner mystring = new StringJoiner(",", "(", ")");    

		mystring.add("Negan");  
		mystring.add("Rick");  
		mystring.add("Maggie");  
		mystring.add("Daryl");  

		System.out.println("First String: "+mystring);

		StringJoiner myanotherstring = new StringJoiner("-", "pre", "suff");    

		myanotherstring.add("Sansa");  
		myanotherstring.add("Imp");  
		myanotherstring.add("Jon");  
		myanotherstring.add("Ned"); 

		System.out.println("Second String: "+myanotherstring);

		
		StringJoiner mergedString = mystring.merge(myanotherstring);   
		System.out.println(mergedString);  
	   }  
}
