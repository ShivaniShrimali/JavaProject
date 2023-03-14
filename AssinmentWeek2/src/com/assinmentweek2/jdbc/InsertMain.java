package com.assinmentweek2.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name student"
				+ " : ");
		String name = sc.next();
		System.out.print("Enter marks"
				+ " : ");
		int mark = sc.nextInt();
		System.out.print("Enter subject"
				+ " : ");
		String sub = sc.next();
		try {
			//load database by Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql:///assing","root","9669137");
			
			//create statement to execute query
					
			
			PreparedStatement st = 
					con.prepareStatement("INSERT INTO "
					+ "student(sname,marks,subjects) VALUES(?,?,?)");
					
					st.setString(1, name);
					st.setInt(2,mark);
					st.setString(3, sub);
					
			
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
