package com.tns.jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class j {
public static void main(String[] args)  {
	

	try {
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo","postgres","root");
	
	
	Statement st=con.createStatement();
	
	String s="select * from stud";
	
	ResultSet rst=st.executeQuery(s);
	while(rst.next()) {
		System.out.println(rst.getInt(1)+"\t"+rst.getString(2)+"\t"+rst.getString(3));
		
		
		}
}
catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
		
	}
		

}
	
}



