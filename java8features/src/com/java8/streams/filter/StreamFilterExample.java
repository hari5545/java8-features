package com.java8.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample {
	public static void main(String[] args) {

		// A Simple Example of Java Stream Filter()
		
		List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

		Stream<String> allNames = names.stream();


		Stream<String> longNames = allNames.filter(str -> str.length() > 6);

		longNames.forEach(str->System.out.print(str+" "));
		
		
		// Stream filter() and collect()
		  List<String> names2 = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

	        List<String> longnames = names2.stream()    // converting the list to stream
	                .filter(str -> str.length() > 6)   // filter the stream to create a new stream
	                .collect(Collectors.toList());  // collect the final stream and convert it to a List
	        longnames.forEach(System.out::println); 
	        
	        
	    //  Stream filter() with multiple conditions
	        
	        List<String> names3 = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

	        List<String> longnames1 = names3.stream()  
	                .filter(str -> str.length() > 6 && str.length() < 8) //Multiple conditions
	                .collect(Collectors.toList());  

	        longnames1.forEach(System.out::println);   
	        
	      // Stream filter() and map() method in Java
	        
	        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
	        List<Integer> squares = num.stream()
	        		.map(n -> n * n)
	        		.collect(Collectors.toList());
	        System.out.println(squares);        


	}
}
