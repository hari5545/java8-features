package com.java8.stringjoinnerclass;

import java.util.StringJoiner;

public class StringJoinerAddingPrefixAndSuffixExample {
	public static void main(String[] args) {  
    	
        StringJoiner mystring = new StringJoiner("-"," ",".");    
          
       
        mystring.add("Negan");  
        mystring.add("Rick");  
        mystring.add("Maggie");  
        mystring.add("Daryl");  
                  
        System.out.println(mystring);  
    }  
}
