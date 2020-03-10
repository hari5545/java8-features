package com.java8.methodrefrences;

import java.util.function.BiFunction;

public class StaticMethodReferenceExample {


	public static void main(String[] args) {
		
		BiFunction<Integer, Integer,Integer> f=StaticMethodReferenceExample::add;
		int b=f.apply(50, 50);
		System.out.println(b);
	}

	public static int add(int a,int b) {
		return a+b;
	}
}
