package com.jdbcdemo.main;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowAllMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		try {
			//load database by Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/11feb?useSSL=faslse","root","96691");
			
			//create statement to execute query
			Statement st= con.createStatement();
			
			//execute the query
			//store result of the query into ResultSet
			ResultSet rs = st.executeQuery("SELECT * From dept");
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
