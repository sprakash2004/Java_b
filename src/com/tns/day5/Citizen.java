package com.tns.day5;

public class Citizen 
{
private String address;
private String name;
private String aadharNo;
private int phNo;
public Citizen()
{
	
}

public Citizen(String address, String name, String aadharNo, int phNo) {

	this.address = address;
	this.name = name;
	this.aadharNo = aadharNo;
	this.phNo = phNo;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name =name;
}
public String getAadharNo() {
	return aadharNo;
}
public void setAadharNo(String aadharNo) {
	this.aadharNo = aadharNo;
}
public int getPhNo() {
	return phNo;
}
public void setPhNo(int phNo) {
	this.phNo = phNo;
}
@Override
public String toString() {
	return "Citizen [address=" + address + ", name=" + name + ", aadharNo=" + aadharNo + ", phNo=" + phNo + "]";
}


}