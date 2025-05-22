package com.tns.day3;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationExample obj= new EncapsulationExample();
		obj.setAge(20);
		obj.setName("S_Prakash");
		obj.setSerialNum(96);
		obj.getSerialNum();
		obj.getAge();
		obj.getName();
		String name1=obj.getName();
		int slno = obj.getSerialNum();
		int age=obj.getAge();
		
		System.out.println(obj);
		System.out.println(name1);
		System.out.println(slno);
		System.out.println(age);
	}

}
