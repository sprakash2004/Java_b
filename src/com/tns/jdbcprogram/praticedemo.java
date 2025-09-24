package com.tns.jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class praticedemo {

public static void main(String[] args) {
		
		//step 2:load and register driver (or) we can go for direct establish connection
		
		// step:3 establish connection
		
try {
	Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");
	
	//step 4: create statment
	
	Statement st=conn.createStatement();
	
	//step 5: execute query
	
	String strselect="select title,price,qty from good";
	System.out.println("the sql statement is"+strselect);
	
	// process the result to display
	
	ResultSet rst=st.executeQuery(strselect);
	System.out.println("the records are");
	
	int rowcout=0;
	while(rst.next()) {
		String title=rst.getString("title");
		int price=rst.getInt("price");
		int qty=rst.getInt("qty");
		
		System.out.println(title+" "+price+" "+qty);
		++rowcout;
	}

	
} catch (SQLException e) {
	
	e.printStackTrace();
}
	}
}


