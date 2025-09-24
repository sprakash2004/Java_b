package com.tnsif.scanner;

public class Taxcalucation {
public void calucation(Person p1) {
	if(p1.getIncome()<=16000) {
		p1.setTax(0);
	}
	else if(p1.getIncome()>16000 && p1.getIncome()<=70000) {
		p1.setTax(5);
	}
	else
	{
		p1.setTax(10);
	}
}
}
