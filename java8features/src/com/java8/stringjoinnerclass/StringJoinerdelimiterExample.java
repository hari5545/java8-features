package com.java8.stringjoinnerclass;

import java.util.StringJoiner;

public class StringJoinerdelimiterExample {
	public static void main(String[] args) {

		StringJoiner mystring=new StringJoiner("-");
		mystring.add("Logan");  
        mystring.add("Magneto");  
        mystring.add("Rogue");  
        mystring.add("Storm");  
        System.out.println(mystring);
	}
}
