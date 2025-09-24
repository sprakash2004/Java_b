package com.tns.jdbcprogram;
// step 1
import java.sql.*;
import javax.sql.*;

import com.mysql.cj.protocol.Resultset;


public class Preparedstatementdemo {

	public static void main(String[] args) {
		
		// step 2
		// step 3 establish connection
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hyd11","root","root");
			
		// step 4 create statement
			
			Statement st=conn.createStatement();
			
			// insert values
//			String sqlinsert="insert into books values(3,'javascript',760,4)";
//			System.out.println("the sql statement is"+sqlinsert);
//			
//			int countinsert=st.executeUpdate(sqlinsert);
//			System.out.println(countinsert +"record inserted");
			// update query
			
//			String updateqry="update books set booktitle='react' where booktitle='javascript'";
//			int rowupdate=st.executeUpdate(updateqry);
//			System.out.println(rowupdate);
			
			// delete record from database
			
//			String sqldelete="delete from books where bookid=1";
//			System.out.println("the sql stamenet is"+sqldelete);
//			int countdeleted=st.executeUpdate(sqldelete);
//			System.out.println(countdeleted+"record deleted");
			
			String strselect="select booktitle,price,qty from books";
			
			System.out.println("the sql stament is"+strselect);
			
			// to disply
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
			}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
