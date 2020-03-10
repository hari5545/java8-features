package com.java8.methodrefrences;

public class InstanceMethodReferenceExample {

	// Method reference to an instance method of an object
	public static void main(String[] args) {
		InstanceMethodReferenceExample e=new  InstanceMethodReferenceExample();
		MyInterface m=e::add;
		System.out.println(m.add(10,20));
	}
	public int add(int a,int b) {
		return a+b;
	}
}
