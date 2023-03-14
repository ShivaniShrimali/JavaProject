package com.jdbcdemo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ScrollUpdateDemo {

	public static void main(String[] args) {
		
		
		try {
			//load database by Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql:///dbms","root","9669137");
			
			//create statement to execute query
			PreparedStatement st = 
					con.prepareStatement("SELECT * FROM product",
					ResultSet.TYPE_SCROLL_INSENSITIVE , 
					ResultSet.CONCUR_UPDATABLE);
					
					ResultSet rs = st.executeQuery();
					
					while(rs.next()) {
							System.out.println(rs.getInt("pid")
						+ " : " + rs.getString(2) + " : " + 
						rs.getInt("price"));
					}
					
					if(rs.isAfterLast())
						System.out.println("rs is after last "
								+ "record now");
					
					System.out.println("First product is : ");
					rs.first();
					System.out.println(rs.getInt("pid")
					+ " : " + rs.getString(2) + " : " + 
					rs.getInt("price"));
					
					System.out.println("Last product is : ");
					rs.last();
					System.out.println(rs.getInt("pid")
					+ " : " + rs.getString(2) + " : " + 
					rs.getInt("price"));
					
					System.out.println("Third product is : ");
					rs.absolute(3);
					System.out.println(rs.getInt("pid")
					+ " : " + rs.getString(2) + " : " + 
					rs.getInt("price"));
					
					System.out.println("Previous product is : ");
					rs.previous();
					System.out.println(rs.getInt("pid")
					+ " : " + rs.getString(2) + " : " + 
					rs.getInt("price"));
					
					rs.moveToInsertRow();
					rs.updateString("pname", "pendrive");
					rs.updateInt("price", 550);
					rs.insertRow();
					
					System.out.println("After insertion , all"
							+ " records are : ");
					rs.beforeFirst();
					while(rs.next()) {
						System.out.println(rs.getInt("pid")
						+ " : " + rs.getString(2) + " : " + 
						rs.getInt("price"));
					}
					
					rs.last();
					rs.updateString("pname", "Kingston");
					rs.updateInt("price", 700);
					rs.updateRow();
					
					System.out.println("After updation , all"
							+ " records are : ");
					rs.beforeFirst();
					while(rs.next()) {
						System.out.println(rs.getInt("pid")
						+ " : " + rs.getString(2) + " : " + 
						rs.getInt("price"));
					}
					
					rs.last();
					rs.deleteRow();
					System.out.println("After deletion , all"
							+ " records are : ");
					rs.beforeFirst();
					while(rs.next()) {
						System.out.println(rs.getInt("pid")
						+ " : " + rs.getString(2) + " : " + 
						rs.getInt("price"));
					}
					
					
					con.close();
					
		
	}catch (ClassNotFoundException | SQLException e) {
		  e.printStackTrace();
		}
	}




	}


