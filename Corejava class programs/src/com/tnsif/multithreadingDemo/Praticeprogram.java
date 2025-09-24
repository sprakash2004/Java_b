package com.tnsif.multithreadingDemo;

class Eclipse extends Thread{
	
	public void run() {
		System.out.println("exclipse "+Thread.currentThread().getId());
	}
	
}


public class Praticeprogram{
	public static void main(String[] args) {
		Eclipse e=new Eclipse();
		e.start();
		e.setPriority(Thread.MAX_PRIORITY);
	}
}
















public class Praticeprogram {
	public static void main(String[] args) {
		
	}

}
