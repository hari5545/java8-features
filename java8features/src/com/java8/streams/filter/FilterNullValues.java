package com.java8.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterNullValues {
	public static void main(String[] args) {
    // Filter null values
		
		List<String> list = Arrays.asList("Java", "Stream", null, "Filter", null);
		List<String> result = list.stream().collect(Collectors.toList());
		result.forEach(System.out::println);     
		
	// Filter null values from a stream
		List<String> lists = Arrays.asList("Java", "Stream", null, "Filter", null);
		List<String> results = lists.stream()
				.filter(str -> str!=null)
				.collect(Collectors.toList());
		results.forEach(System.out::println);      
		
		/* Alternatively you can use method reference Objects::nonNull 
		 * in the filter() method to filter out the null values like this:
		 */
		List<String> re = lists.stream()
				.filter(Objects::nonNull)
				.collect(Collectors.toList());
		re.forEach(System.out::println);  
		
		
		//  Filter null values after map intermediate operation
		
		List<Integer> l = Arrays.asList(1, 2, 3, null, 4, null, 5);
		List<Integer> r = l.stream()
			.map(num -> num) //here you will be having a different logic
			.filter(n -> n!=null)
			.collect(Collectors.toList());
		r.forEach(System.out::println);      

	}
}
