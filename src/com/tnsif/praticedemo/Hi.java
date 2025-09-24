package com.tnsif.praticedemo;


class Hello extends Thread{
	public void  run() {
		System.out.println("hello");
	}
}


public class Hi {

	public static void main(String[] args) {
		Hello h=new Hello();
		h.start();
		System.out.println("hello");

	}

}
