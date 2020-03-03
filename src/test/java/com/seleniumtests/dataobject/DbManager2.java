package com.seleniumtests.dataobject;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import com.seleniumtests.webpage.MuviPage;
import com.seleniumtests.webpage.test;


public class DbManager2 {

	public static synchronized Map<Object,Object> executeQuery(String mysqlurl,String mysqluserName,String mysqlpassword,String query)  throws  ClassNotFoundException, SQLException {
		ResultSet rs = null;
		Statement stmt = null;
		Connection con = null;
		  Map<Object,Object> map = new HashMap<Object,Object>();

		try {
			




			//Load mysql jdbc driver		
			Class.forName("com.mysql.jdbc.Driver");			

			//Create Connection to DB		
			con = DriverManager.getConnection(mysqlurl,mysqluserName,mysqlpassword);

			//Create Statement Object		
			stmt = con.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
			rs= stmt.executeQuery(query);	
         

			// While Loop to iterate through all data and print results		
			while (rs.next()){
				
				 int numColumns = rs.getMetaData().getColumnCount();
				 
		            for ( int i = 1 ; i <= numColumns ; i++ ) {
		               // Column numbers start at 1.
		               // Also there are many methods on the result set to return
		               //  the column as a particular type. Refer to the Sun documentation
		               //  for the list of valid conversions.
		               //System.out.println( "COLUMN " + i + " = " + rs.getObject(i) );
		              // map.put(i, rs.getObject(i));
		               map.put(rs.getMetaData().getColumnName(i), rs.getObject(i));
		               
		            }
		            MuviPage.mastermap.put(query, map);
				
				return map;
			}		
			// closing DB Connection	
			con.close();

		} catch (Exception e) {
			 MuviPage.mastermap.put(query, map);
				
				
		} finally {
			
			rs.close();
			stmt.close();
			con.close();
		}

		return map;
	}
	
}

