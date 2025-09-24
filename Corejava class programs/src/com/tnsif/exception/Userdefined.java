package com.tnsif.exception;
// to demostarte userdefined exception
import java.util.Scanner;

public class Userdefined {
	
private static int age;

static void validate() throws Age{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age");
	int age=sc.nextInt();
	if(age<18) {
		throw new Age("invalid age, you are not eligiable");
	}
	else {
		System.out.println("you can vote");
	}
}

}
