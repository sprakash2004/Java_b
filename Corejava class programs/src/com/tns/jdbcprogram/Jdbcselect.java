package com.tns.jdbcprogram;
import java.sql.*;
import javax.sql.*;     // step1 import packages

import com.mysql.cj.protocol.Resultset;

public class Jdbcselect {

	public static void main(String[] args) {
		
		//step 2:load and register driver (or) we can go for direct establish connection
		
		// step:3 establish connection
		
try {
	Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");
	
	//step 4: create statment
	
	Statement st=conn.createStatement();
	
	//step 5: execute query
	
	String strselect="select booktitle,price,qty from books";
	System.out.println("the sql statement is"+strselect);
	
	// process the result to display
	
	ResultSet rst=st.executeQuery(strselect);
	System.out.println("the records are");
	
	int rowcout=0;
	while(rst.next()) {
		String booktitle=rst.getString("booktitle");
		int price=rst.getInt("price");
		int qty=rst.getInt("qty");
		
		System.out.println(booktitle+" "+price+" "+qty);
		++rowcout;
	}

	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}
