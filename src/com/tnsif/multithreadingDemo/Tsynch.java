package com.tnsif.multithreadingDemo;

public class Tsynch {
public static void main(String[] args) {
//	Example ex=new Example();
	T t1=new T();
	T t2=new T();
	T t3=new T();
	
	t1.start();
	t2.start();
	t3.start();
	
}
}
