package com.tns.day6.first;

public class Base {

	int varDefault=10;
	public int varPublic=10;
	private int varPrivate =30;
	protected int varProtected=80;
	void methodDefault() {
		System.out.println("I am a default method");
		System.out.println("Default Variable: "+varDefault);
	}
	
	public void methodPublic() {
		System.out.println("I am a Public method");
		System.out.println("Public Variable: "+varPublic);
		
	}
	
	public void methodPrivate() {
		System.out.println("I am a Private method");
		System.out.println("Private Variable: "+varPrivate);
		
	}
	
	public void methodProtected() {
		System.out.println("I am a Protected method");
		System.out.println("Public Variable: "+varProtected);
		
	}
}
