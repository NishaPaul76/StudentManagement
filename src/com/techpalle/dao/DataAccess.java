package com.techpalle.dao;

import java.sql.*;

import com.techpalle.model.Student;

public class DataAccess 
{
	public static  Connection con = null;
	public static  PreparedStatement ps = null;
	
	//If we want to take an input more than 4 then use this method:
	public static void insertStudent(Student s) 
	{		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","admin");
			
			String qry = "insert into student (name,email,qual,password,mobile) values (?,?,?,?,?)";
			ps =con.prepareStatement(qry);
			
			ps.setString(1, s.getName());
			ps.setString(2,s.getEmail());
			ps.setString(3, s.getQual());
			ps.setString(4, s.getPass());
			ps.setLong (5,s.getMob());
			
			ps.executeUpdate();
		} 
		catch (ClassNotFoundException e1) 
		{
			e1.printStackTrace();
		} 
		catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
		finally 
		{
			try
			{ 
				if (ps!=null) 
				{	
					ps.close();
				}
				if (con!=null) 
				{	
					con.close();
				}
			} 
			catch (SQLException e1)
			{
				e1.printStackTrace();
			}
		}
	}
}
