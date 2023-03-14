package com.jdbcdemo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ShowListMain {

	public static void main(String[] args) {
		
		
		try {
			//load database by Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql:///student","root","9669137");
			
			//create statement to execute query
			PreparedStatement st = 
					con.prepareStatement("SELECT * FROM stud");
					
			
			//execute the query
			//store result of the query into ResultSet
			ResultSet rs = st.executeQuery();
			//process data from the ResultSet
			if(rs.isBeforeFirst())
			{
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				}
			}
			else
			{
				System.out.println("not found");
			}
			con.close();
		
	}catch (ClassNotFoundException | SQLException e) {
		  e.printStackTrace();
		}
	}




	}


