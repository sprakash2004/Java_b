package com.tnsif.jdbcpro;

import java.sql.*;
import javax.sql.*;   // step 1 

public class Preparedstatement {
	
	public static void main(String[] args) {
		// step 2 load and register driver
		

		// step 3:Establish connection
		
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hyd11","root","root");
			
			// step 4: create statement
			
			Statement st=conn.createStatement();
			
			// execute a sql insert statement via execute update
			
//			String strInsert="insert into books values(5,'javascript',760,4)";
//			
//			System.out.println("The sql statement "+strInsert);
//			
//			int countinserted=st.executeUpdate(strInsert);
//			System.out.println(countinserted +"record inserted");
//			
			// delete record from database
			
//			String sqldelete="delete from books where bookid=300";
//			System.out.println("the sql statement"+sqldelete);
//			
//			int countdeleted=st.executeUpdate(sqldelete);
//			
//			System.out.println(countdeleted +" record deleted");
//			
			ResultSet rst=st.executeQuery(strselect);
			System.out.println("The records are");
			int rowcount=0;
			while(rst.next()) {
				String booktitle=rst.getString("booktitle");
				int price=rst.getInt("price");
				int qty=rst.getInt("qty");
				
				System.out.println(booktitle+" "+price+" "+qty);
				++rowcount;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
