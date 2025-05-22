package com.tns.day4;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the name");
		String name= obj.next();
		System.out.println("enter the income");
		int income= obj.nextInt();
		System.out.println("Enter the gender");
		String gender = obj.next();
		System.out.println("Enter the age");
		int age = obj.nextInt();
		System.out.println("Enter the tax");
		int tax = obj.nextInt();
		
		Person p= new Person();
		p.setName(name);
		p.setAge(age);
		p.setGender(gender);
		p.setIncome(income);
		p.setTax(tax);
		
		System.out.println(p);
	}

}
