package com.tnsif.setdemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// to demostrate set operations
public class SetOperation {
public static void operations() {
	Set<Integer>  s= new HashSet<Integer>();
	s.add(12);
	s.add(13);
	s.add(18);
	s.add(6);
	System.out.println(s);
	
	Set<Integer>  s1= new HashSet<Integer>();
	s1.addAll(Arrays.asList(new Integer[] {1,3,4,5}));
	System.out.println(s1);
	// contains
	System.out.println("number contains element 3"+s1.contains(3));
	// to do intersection
	s1.retainAll(s);
	System.out.println("set intersection"+s1);
	Set<Integer>  union= new HashSet<Integer>(s);
	// to do union
	union.addAll(s1);
	System.out.println("set union" + union);
}
}
