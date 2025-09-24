 package com.tnsif.scanner;

import java.util.Scanner;

public class Exec {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the person name");
	String name=sc.nextLine();
	System.out.println("enter the person income");
	int income=sc.nextInt();
	
	
	Person p1=new Person();
	p1.setName(name);
	p1.setIncome(income);
	
	Taxcalucation t=new Taxcalucation();
	t.calucation(p1);
	System.out.println("after calucation");
	System.out.println(p1);
}
}
