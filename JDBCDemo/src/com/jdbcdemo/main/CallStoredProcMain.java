package com.jdbcdemo.main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Types;


public class CallStoredProcMain {

	public static void main(String[] args) {
		
		
		try {
			//load database by Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql:///11feb","root","9669137");
			int empid = 2;
			CallableStatement cs = 
					con.prepareCall("{call myproc(?,?)}");
			
			cs.setInt(1, empid);
			
			cs.registerOutParameter(2, Types.CHAR);
			
			cs.execute();
			
			String dname = cs.getString(2);
			
			System.out.println("department name : " +dname);
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		
		}
	}
}



	


