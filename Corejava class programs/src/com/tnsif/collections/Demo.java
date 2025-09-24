package com.tnsif.collections;
// to demostarte arraylist
import java.util.ArrayList;
import java.util.Collections;
//add
//size
//contains
public class Demo {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	//System.out.println("size" + a.size());
	a.add(2);
	a.add("suma");
	a.add(89.8);
	a.add('a');
	
	System.out.println(a);   // list of collection
	System.out.println("size" + a.size());  // size
	System.out.println(a.contains(56));  // check wheather data is present or not
	System.out.println("check the list is empty or not " + a.isEmpty());
	System.out.println("removing the elment"+a.remove(1));
	System.out.println(a);
	//System.out.println(a.sort(null)); // sorting is not possible

}

}
