package com.java8.foreach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEachExample {


	public static void main(String[] args) {

		// for-each for list

		List<String> list=Arrays.asList("sree","hari","sreehari");
		list.forEach(System.out :: println);
		list.forEach(l-> System.out. println(l));


		//for each for set
		Set<String> set= new HashSet<>();
		set.add("sree");
		set.add("hari");
		set.forEach(System.out :: println);

		//for each for map
		Map<Integer, Student> map= new HashMap<>();
		map.put(1,new Student(101, "sree"));
		map.put(2,new Student(102, "sreehari"));
		map.put(3,new Student(103, "hari"));
		map.put(4,new Student(104, "harisree"));

		map.forEach((key,value)->System.out.println(key+"-"+value));

		// 4th record only using if

		map.forEach((key,value) ->{
			if(key==4) {
				System.out.println(key +"-"+value);
			}
		});	

		map.forEach((key,value) ->{
			if("hari".equals(value.name)) {
				System.out.println(value);
			}
		});

		// forEach method to iterate a Stream

		List<Student> student=Arrays.asList(new Student(101,"hari"),new Student(102, "s"),new Student(102, "siri"),new Student(102, "sree"),new Student(103, "sreehari"));
		student.stream().filter(s-> s.name.startsWith("s")).parallel().forEach(System.out :: println);
		
		
		// Stream forEachOrdered() Method Example
		
		
		List<Student> student2=Arrays.asList(new Student(101,"hari"),new Student(102, "s"),new Student(102, "siri"),new Student(102, "sree"),new Student(103, "sreehari"));
		student2.stream().filter(s-> s.name.startsWith("s")).parallel().forEachOrdered(System.out :: println);
	
	
	} 
}