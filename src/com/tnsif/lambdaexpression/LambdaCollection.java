package com.tnsif.lambdaexpression;

import java.util.ArrayList;

// to demostarte the lambda expression for collections

public class LambdaCollection {
	public static void main(String[] args) {
		ArrayList <Integer> li=new ArrayList<Integer> ();
		li.add(2);
		li.add(22);
		li.add(8);
		li.add(5);
		// for each loop
//		for(Integer ele:li) {
//			System.out.println(ele);
//		}
		// lambda exression
		
		li.forEach(element -> System.out.println(element));
	}

}
