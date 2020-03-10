package com.java8.lamdaexpression;

import java.util.Arrays;
import java.util.List;

public class LamdaExpressionExample {
	public static void main(String[] args) {
		List<Employee> employee=Arrays.asList(new Employee(1, "sri"),new Employee(2, "java"));
		employee.forEach(e->System.out.println(e));

		Book b= ()->{
			System.out.println("hello");
		};
		b.book();
		
		
		Books books=(a,b2)->{
			int c=a+b2;
			System.out.println(c);
		};
		books.book(1, 20);
		//System.out.println();
	}
}
