package com.java8.funtionalinterface;

public class ThreadClass {
	public static void main(String[] args) {
		Runnable runnable =() ->{
			System.out.println("hello");
		};
		Thread t=new Thread(runnable);
		t.start();
	}
}
