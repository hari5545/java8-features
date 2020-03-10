package com.java8.streams.filter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapExample {
	public static void main(String[] args) {

		// Filter Map by Keys

		Map<Integer, String> hmap = new HashMap<Integer, String>(); 
		hmap.put(11, "Apple"); 
		hmap.put(22, "Orange"); 
		hmap.put(33, "Kiwi");  
		hmap.put(44, "Banana"); 

		Map<Integer, String> result = hmap.entrySet() 
				.stream() 
				.filter(map -> map.getKey().intValue() <= 22) 
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));  

		System.out.println("Result: " + result);

		// Filter Map by Values

		Map<Integer, String> hmaps = new HashMap<Integer, String>();
		hmaps.put(11, "Apple");
		hmaps.put(22, "Orange");
		hmaps.put(33, "Kiwi");
		hmaps.put(44, "Banana");

		Map<Integer, String> results = hmaps.entrySet()
				.stream()
				.filter(map -> "Orange".equals(map.getValue()))
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

		System.out.println("Result: " + results);


		// Filter Map by both Keys and Values

		/* When we filter a Map like this we are joining both the conditions by AND (&&) logical operator.
		 *  You can also place both the conditions in the single filter()
		 *  method and join them using any logical operator such as OR (||), AND(&&) or NOT(!).
		 */
		 Map<Integer, String> hm = new HashMap<Integer, String>();
	      hm.put(1, "ABC");
	      hm.put(2, "XCB");
	      hm.put(3, "ABB");
	      hm.put(4, "ZIO");

	      Map<Integer, String> res = hm.entrySet()
	         .stream()
	         .filter(p -> p.getKey().intValue() <= 2) //filter by key
	         .filter(map -> map.getValue().startsWith("A")) //filter by value
	         .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

	     System.out.println("Result: " + res);
	}
}
