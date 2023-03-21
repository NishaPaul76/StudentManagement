package com.techpalle.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.DataAccess;
import com.techpalle.model.Student;


@WebServlet("/hello")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// Read the data Given by user/student 
		
		String name = request.getParameter("tbname");
		String email = request.getParameter("tbmail");
		String qual = request.getParameter("tbqual");
		String password = request.getParameter("tbpass");
		long mobile  =Long.parseLong(request.getParameter("tbmobile"));
		
		//Add above data to student object :
		Student stud = new Student (name,email,qual,password,mobile);
		
		//call the insertStudent method and pass the above value as input
		DataAccess.insertStudent(stud);
		
		//Display some success message 
		//response.getWriter().append("<h1>Data is inserted ..</h1>");
		
		//Redirect user to login.html page 
		//Note: sendRedirect() will only redirect to other page but will not transfer the data
		 //response.sendRedirect("login.jsp");
		 
		 //Redirect user to login.jsp and transfer the data from reg.html to login jsp
		 //method :getRequestDispatcher (String jspFileName.jsp)
		 RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		 
		 // Write the code to transfer the data
		 
		 rd.forward(request, response);
		 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
