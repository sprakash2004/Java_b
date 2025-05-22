package com.tns.day8;

public abstract class Shape {
	protected float area; 
	abstract void calArea(); // abstract
	void show()  // non abstract 
	{ 
		System.out.println("the area is :"+area);
	}
}
