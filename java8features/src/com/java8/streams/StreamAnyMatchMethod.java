package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamAnyMatchMethod {
	public static void main(String[] args) { 
		   Predicate<Student> p1 = s -> s.stuName.startsWith("S");
		      Predicate<Student> p2 = s -> s.stuAge < 28 && s.stuName.startsWith("Z");       
		      List<Student> list = Student.getStudents();
		      boolean b3 = list.stream().anyMatch(p1);
		      System.out.println(b3);
		      boolean b4 = list.stream().anyMatch(p2);
		      System.out.println(b4);
	   }
	static class  Student{
		int stuId; 
		int stuAge;  
		String stuName;  
		Student(int id, int age, String name){
			this.stuId = id;   
			this.stuAge = age;  
			this.stuName = name;  
		}  
		public int getStuId() { 
			return stuId;  
		}  
		public int getStuAge() {  
			return stuAge;  
		} 
		public String getStuName() {  
			return stuName;  
		}  
		public static  List<Student> getStudents(){ 
			List<Student> list = new ArrayList<>(); 
			list.add(new Student(11, 28, "Lucy")); 
			list.add(new Student(28, 27, "Tim")); 
			list.add(new Student(32, 30, "Daniel")); 
			list.add(new Student(49, 27, "Steve")); 
			return list; 
		}
	}
}