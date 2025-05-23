package com.tns.day10.Static;

public class FinalVariable {
	final int x=100;
	final static int Y;
	final static int Z=10;
	
	void change() {
		x=30;
		Y=100;
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + " y= "+ Y +"]";
		
	}
	
	static {
		Y=20;
		Z=100;
		System.out.println("Value of Y is "+Y);
	}
	
	
}
