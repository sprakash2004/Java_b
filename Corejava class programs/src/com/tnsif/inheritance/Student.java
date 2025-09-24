package com.tnsif.inheritance;

public class Student extends Citizen {

	private int roolno;                   // data members
	private String collegename;
	// default constructor
	public Student() {
		super();
		
	}
// parameterzied constructor
	
	
	// getter and setter method
	public int getRoolno() {
		return roolno;
	}
	
	// parent class parameterzied 
	public Student(String name,String address,long aadharno,long phoneno) {
	super(name,address,aadharno,phoneno);
//	this.roolno = roolno;
//	this.collegename = collegename;
}
	public void setRoolno(int roolno) {
		this.roolno = roolno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
// students class parameterized 

	public Student(int roolno, String collegename) {
		super();
		this.roolno = roolno;
		this.collegename = collegename;
	}


	@Override
	public String toString() {
		return super.toString()+"Student [roolno=" + roolno + ", collegename=" + collegename + "]";
	}


	
	
}
