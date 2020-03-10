package com.java8.parallelsort;

import java.util.Arrays;

public class ParallelSortMethodExample {

	public static void main(String[] args) {
		int[] n= {100,200,30,40,500};
		Arrays.parallelSort(n);
		Arrays.stream(n).forEach(a->System.out.println(a));
		
	}
}
