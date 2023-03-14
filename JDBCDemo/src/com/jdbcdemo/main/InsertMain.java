package com.jdbcdemo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of the new product"
				+ " : ");
		String name = sc.next();
		System.out.print("Enter price of the new product"
				+ " : ");
		int prc = sc.nextInt();
		try {
			//load database by Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql:///dbms","root","9669137");
			
			//create statement to execute query
					
			
			PreparedStatement st = 
					con.prepareStatement("INSERT INTO "
					+ "product(pname,price) VALUES(?,?)");
					
					st.setString(1, name);
					st.setInt(2, prc);
					
			
			//process data from the ResultSet
int count = st.executeUpdate();
			
			if(count > 0)
				System.out.println("product inserted");
			else
				System.out.println(
						"product insertion failed");
			
			con.close();
		
	}catch (ClassNotFoundException | SQLException e) {
		  e.printStackTrace();
		}
	}




	}


