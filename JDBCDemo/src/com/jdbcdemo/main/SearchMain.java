package com.jdbcdemo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id of the product to be "
				+ "searched : ");
		int id = sc.nextInt();
		try {
			//load database by Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql:///dbms","root","9669137");
			
			//create statement to execute query
			PreparedStatement st = 
					con.prepareStatement("SELECT * FROM product"
							+ " WHERE pid = ?");
					
			st.setInt(1, id);
			//execute the query
			//store result of the query into ResultSet
			ResultSet rs = st.executeQuery();
			if(rs.isBeforeFirst()) {
				rs.next();
				System.out.println(rs.getInt("pid")
				+ " : " + rs.getString(2) + " : " + 
				rs.getInt("price"));
			}
			else
				System.out.println("no such product found");
			
			con.close();
		
	}catch (ClassNotFoundException | SQLException e) {
		  e.printStackTrace();
		}
	}




	}


