package com.tnsif.constructor;

import java.util.Scanner;

public class CustomerDemo {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the name");
	String name=sc.nextLine();
	
	System.out.println("enter the address");
	String adress=sc.nextLine();
	
	System.out.println("enter the id");
	int id=sc.nextInt();
	
	
	Customer c=new Customer();
	c.setName(name);
	c.setAddress(adress);
	c.setId(id);
	
	System.out.println(c);
	
	boolean output= c instanceof Customer;
	System.out.println(output);
}
}
