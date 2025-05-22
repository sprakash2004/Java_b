package com.tns.day6.first;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1 = new Base();
	//	b1.varPrivate=40; ---->  Not accessible
 		b1.varDefault=80;
		b1.varProtected=65;
		b1.varPublic=23;
		b1.methodPublic();
		b1.methodPrivate();
		b1.methodProtected();
		b1.methodDefault();
	}

}
