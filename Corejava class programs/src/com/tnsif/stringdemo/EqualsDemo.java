package com.tnsif.stringdemo;
// to demostarte equals 
public class EqualsDemo {
public static void main(String[] args) {
	String s1="sachin";
	String s2="sachin";
	
	String s3=new String("sachin");
	String s4="rahul";
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
}
}
