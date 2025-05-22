package com.tns.day8;

public class Square extends Shape{

	private float side;
	
	public Square() {
		this.side = 2.0f;
	}
	
	public Square(float side) {
//		super();
		this.side = side;
	}

	@Override
	void calArea() {
		// TODO Auto-generated method stub
		area= side*side;
	}

}
