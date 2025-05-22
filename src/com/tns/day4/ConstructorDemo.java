package com.tns.day4;

public class ConstructorDemo {
	public static void main(String[] args) {
		Customer obj = new Customer("Sathiya",96,"Bangalore");
		obj.setCustomerCity("Bangalore");
		obj.setCustomerId(96);
		obj.setCustomerName("SathiyaPrakash");
		obj.getCustomerCity();
		obj.getCustomerId();
		obj.getCustomerName();
		System.out.println(obj);
	}
}
