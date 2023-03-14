package com.jdbcdemo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeletMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id of the product to be"
				+ " deleted : ");
		int id = sc.nextInt();
		try {
			//load database by Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql:///dbms","root","9669137");
			
			//create statement to execute query
con.setAutoCommit(false);
			
			//3) create Statement to execute query
			PreparedStatement st = 
			con.prepareStatement("DELETE FROM product"
					+ " WHERE pid = ?");
			
			st.setInt(1, id);
			
			//4) execute the query
			int count = st.executeUpdate();
			con.commit();
			
			if(count > 0)
				System.out.println("product deleted");
			else
				System.out.println("product deletion failed"
						+ " or no such product found");
						con.close();
		
	}catch (ClassNotFoundException | SQLException e) {
		  e.printStackTrace();
		}
	}




	}


