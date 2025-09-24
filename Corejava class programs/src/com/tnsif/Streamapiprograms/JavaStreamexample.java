package com.tnsif.Streamapiprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamexample {

	public static void main(String[] args) {
		List<Product> productlist=new ArrayList<Product>();
		// filtering collection by using stream
		productlist.add(new Product(1,"hp laptop",25000f));
		productlist.add(new Product(2,"dell laptop",35000f));
		productlist.add(new Product(3,"lenova laptop",45000f));
		productlist.add(new Product(4,"apple laptop",65000f));
		
//		List<Float> p2= productlist.stream().filter(p->p.price>30000)//filtering data
//				.map(p->p.price)// fetching price
//				.collect(Collectors.toList()); //collecting as list
//		
//		System.out.println(p2);
		
		// sum by using collectors method
		
//		double totalprice= productlist.stream().collect(Collectors.summingDouble(product->product.price));
//		System.out.println(totalprice);
		// find max product list
		
//	Product p=productlist.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
//	
//	System.out.println(p.price);
//	
	// find min product price list
	
	Product p=productlist.stream().min((p1,p2)->p1.price>p2.price?1:-1).get();
		System.out.println(p.price);
		// count() method
		
		long count=productlist.stream().filter(product->product.price<10000).count();
		System.out.println(count);
	}
}
