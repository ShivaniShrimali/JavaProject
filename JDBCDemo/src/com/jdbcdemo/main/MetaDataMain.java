package com.jdbcdemo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MetaDataMain {

	public static void main(String[] args) {
		
		
		try {
			//load database by Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql:///dbms","root","9669137");
			
			//create statement to execute query
			PreparedStatement st = 
					con.prepareStatement("SELECT * FROM product");
					
					//4) execute the query
					//5) store result of the query into ResultSet
					ResultSet rs = st.executeQuery();
					
					ResultSetMetaData rsmd = rs.getMetaData();
					
					int count = rsmd.getColumnCount();
					
					System.out.println("name of database : " +
					rsmd.getCatalogName(1));
					
					System.out.println("name of table : " + 
					rsmd.getTableName(1));
					
					System.out.println("total no. of columns "
							+ "in rs : " + count);
					
					for(int i = 1 ; i <= count ; i++) {
						System.out.println(rsmd.getColumnName(i) +
						" : " + rsmd.getColumnTypeName(i) + 
						" : " + rsmd.getColumnClassName(i));
					}
					

			con.close();
		
	}catch (ClassNotFoundException | SQLException e) {
		  e.printStackTrace();
		}
	}




	}


