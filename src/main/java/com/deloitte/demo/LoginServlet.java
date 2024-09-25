package com.deloitte.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String URL = "jdbc:mysql://localhost:3306/vaman";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	// URL: http://localhost:8090/deloitte-servlet-demo/login

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet method called.");
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost method called.");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println("Username: " + username);
		System.out.println("Password: " + password);

		if (this.validateUser(username, password)) {
			request.setAttribute("message", "Login successfil!");
		} else {
			request.setAttribute("message", "Invalid credentials.");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}

	private boolean validateUser(String username, String password) {
		boolean isValid = false;
		// code 
		return isValid;
	}
}


//CREATE TABLE app_users (
//    id INT PRIMARY KEY AUTO_INCREMENT,
//    username VARCHAR(255) NOT NULL UNIQUE,
//    password VARCHAR(255) NOT NULL
//);
//
//INSERT INTO app_users (username, password) VALUES ('sonu', 'sonu');
//INSERT INTO app_users (username, password) VALUES ('monu', 'monu');
//COMMIT;


//package com.deloitte.demo;
//
//import java.io.IOException;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/login")
//public class LoginServlet extends HttpServlet {
//
//	private static final long serialVersionUID = 1L;
//
//	// URL: http://localhost:8090/deloitte-servlet-demo/login
//
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.out.println("doGet method called.");
//		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.out.println("doPost method called.");
//
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//
//		System.out.println("Username: " + username);
//		System.out.println("Password: " + password);
//
//		if ("sonu".equals(username) && "sonu".equals(password)) {
//			request.setAttribute("message", "Login successfil!");
//		} else {
//			request.setAttribute("message", "Invalid credentials.");
//		}
//
//		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
//		dispatcher.forward(request, response);
//	}
//}
