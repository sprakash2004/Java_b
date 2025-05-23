package com.tns.day10.Static;

final class FinalDemo {
	void show() {
		System.out.println("Final Class cannot be inherited");
	}
	class Final3 extends FinalDemo{
		//Final3 extends FinalDemo throws an error as the FinalDemo is final class and cannot be changed
		//Final method wont let you do overloading 
		
	}
}
