package com.tnsif.overloading1;

public class Point {
private float x;
private float y;

public Point() {
	x=0.07f;
	y=0.9f;
}
public Point(float x) {
	this.x=x;
	this.y=x;
}
public Point (Float x,float y) {
	this.x=x;
	this.y=y;
}

@Override
public String toString() {
	return "Point [x=" + x + ", y=" + y + "]";
}
public static void main(String[] args) {
	Point p=new Point();
	Point p1=new Point(3.4f);
	
	System.out.println(p);

	System.out.println(p1);
	
}
}
