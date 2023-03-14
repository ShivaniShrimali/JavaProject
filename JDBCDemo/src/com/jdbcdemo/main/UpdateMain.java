package com.jdbcdemo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id of the new product to be"
				+ " updated : ");
		int id = sc.nextInt();
		System.out.print("Enter new name of the product"
				+ " : ");
		String name = sc.next();
		System.out.print("Enter new price of the product"
				+ " : ");
		int prc = sc.nextInt();
		try {
			//load database by Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql:///dbms","root","9669137");
			
			//create statement to execute query
			PreparedStatement st = 
					con.prepareStatement("UPDATE product SET"
					+ " pname = ? , price = ? WHERE pid = ?");
					
					st.setString(1, name);
					st.setInt(2, prc);
					st.setInt(3, id);
					
					//4) execute the query
					int count = st.executeUpdate();
					
					if(count > 0)
						System.out.println("product updated");
					else
						System.out.println("product updation failed"
								+ " or no such product found");
					
			con.close();
		
	}catch (ClassNotFoundException | SQLException e) {
		  e.printStackTrace();
		}
	}




	}


