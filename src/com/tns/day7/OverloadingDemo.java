package com.tns.day7;

public class OverloadingDemo {
	public static void main(String[] args) {
		int answer1= MethodOverloading.addition(2,3,4);
		int answer2= MethodOverloading.addition(2,5);
		float answer3= MethodOverloading.addition(2.9f,3.4f);
//		double answer4= MethodOverloading.addition(2,5.2f);

		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
//		System.out.println(answer4);

	}
}
