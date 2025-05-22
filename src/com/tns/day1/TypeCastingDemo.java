package com.tns.day1;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// implicit type casting
		byte b=10;
		int i=b;
		short sh=2;
		double d=sh;
		System.out.println(i);
		System.out.println(b);
		System.out.println(sh);
		System.out.println(d);
		System.out.println("*****************************************************************");
		//explicit type casting 
		float f1=34.56f;
		int f2=(int)f1;
		
		double f3= 2.1324234d;
		long f4= (long)f3;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
	}

}
