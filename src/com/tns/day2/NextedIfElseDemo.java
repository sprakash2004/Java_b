package com.tns.day2;

public class NextedIfElseDemo {
	public static void main(String args[]) {
		int a =1120, b=1255,c=460;
		if(a<b) {
			if(b<c) {
				System.out.println("c is the maximum number");
			}
				System.out.println("b is maximum number");		
		}
		else {
			if(a<c){
				System.out.println("c is the maximum number");
			}
			System.out.println("a is the maximum number");
		}
	}
}
