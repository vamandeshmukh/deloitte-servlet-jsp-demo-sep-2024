package com.deloitte.demo;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

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

		if ("sonu".equals(username) && "sonu".equals(password)) {
			request.setAttribute("message", "Login successfil!");
		} else {
			request.setAttribute("message", "Invalid credentials.");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}
}
