package com.java8.collectorclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectorsGroupingByExample {
	public static void main(String[] args) {
		  List<String> names =
		          Arrays.asList("Jon", "Ajeet", "Steve",
		             "Ajeet", "Jon", "Ajeet");

		      Map<String, Long> map =
		      names.stream().collect(
		          Collectors.groupingBy(
		             Function.identity(), Collectors.counting()
		          )
		      );

		      System.out.println(map);
		// working with objects 
		      List<Student> studentlist = new ArrayList<Student>();       
				studentlist.add(new Student(11,"Jon",22));      
				studentlist.add(new Student(11,"Jon",22));        
				studentlist.add(new Student(11,"Jon",22));        
				studentlist.add(new Student(11,"Jon",22));         
				studentlist.add(new Student(33,"Lucy",32));  
			
				Map<String, Long> maps=studentlist.stream().collect(Collectors.groupingBy(Student::getName,Collectors.counting()));
				maps.forEach((k,v)->System.out.println(k+"-"+v));
	                
	
	}
}
