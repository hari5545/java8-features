package com.java8.funtionalinterface;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorClass {
	public static void main(String[] args) {
		IntBinaryOperator binary=(a,b)->a+b;
		System.out.println(binary.applyAsInt(10, 30));
	}
}
