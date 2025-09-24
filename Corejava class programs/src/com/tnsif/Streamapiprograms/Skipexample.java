package com.tnsif.Streamapiprograms;

import java.util.stream.Stream;

// to demostrate skip example
public class Skipexample {

	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,6,8,9,10,11,12,14)
		.filter(num->num%2==0)  // filter even number//
	//.skip(2)   // skip the first two numbers
		
		.limit(6)   //it will give only one element
		.forEach(num->System.out.println(num+""));
		
	}
}
