package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*  In the first example, we are iterating the whole list to find the strings with length less than 6. 
       There is no parallelism in this code.
       In the second example, the stream() method returns a stream of all the names, 
       the filter() method returns another stream of names with length less than 6, 
       the count() method reduces this stream to the result. 
       All these operations are happening parallelly which means we are able to parallelize the code with the help of streams.
       Parallel execution of operations using stream is faster than sequential execution without using streams.
       
       */ 
public class StreamsExample {

	  public static void main(String[] args) {
			//list 1
			List<String> alphabets = Arrays.asList("A","B","C");
			//list 2
			List<String> names = Arrays.asList("Sansa","Jon","Arya");
				
			//creating two streams from the two lists and concatenating them into one
			Stream<String> opstream = Stream.concat(alphabets.stream(), names.stream());
				
			//displaying the elements of the concatenated stream
			opstream.forEach(str->System.out.print(str+" "));
		   }
		}