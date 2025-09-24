package com.tnsif.jdbcpro;

import java.sql.*;
import javax.sql.*;  // step 1 import pacakges
public class Jdbcselect {
	
	public static void main(String[] args) {
		
	// step2: load and register the driver
	
	// step 3:Establish connection
	
	try {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hyd11","root","root");
		
		// step 4: create statement
		
		Statement st=conn.createStatement();
		
		// step 5: execute quary
		
		String strselect="Select booktitle,price,qty from books";
		
		// process the result to display
		
		ResultSet rst=st.executeQuery(strselect);
		System.out.println("The records are");
		int rowcount=0;
		while(rst.next()) {
			String booktitle=rst.getString("booktitle");
			int price=rst.getInt("price");
			int qty=rst.getInt("qty");
			
			System.out.println(booktitle+" "+price+" "+qty);
			++rowcount;
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
