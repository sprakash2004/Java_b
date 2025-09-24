package com.tnsif.staticprogram;

//to demostarate static program

public class Employee {
 int eid;
 String name;  //non-static variable
 static String company="TNS"; //static variable
 
 
 Employee(int e,String n){
	 eid=e;
	 name=n;
 }
 void display() {
	 System.out.println(eid +" "+name+" "+company);
 }
}
