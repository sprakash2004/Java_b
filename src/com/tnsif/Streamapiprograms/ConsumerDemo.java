package com.tnsif.Streamapiprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// to demostrate consumer program
public class ConsumerDemo {

	public static void main(String[] args) {
		List<String> cities=new ArrayList<String>();
		cities.add("bv");
		cities.add("bvb");
		cities.add("bbv");
		
		Consumer<String> print=city->System.out.println(city);
	}
}
