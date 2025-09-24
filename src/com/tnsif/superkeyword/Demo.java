package com.tnsif.superkeyword;

public class Demo extends SuperDemo {
int a=50;

void drink() {
	System.out.println("coffe");
	
}
void show() {
	drink();
	super.drink();
	
}

Demo(){
	super();
	System.out.println("hello world");
	
}

public static void main(String[] args) {
	Demo d =new Demo();
	
	//d.show();

	
}
}
