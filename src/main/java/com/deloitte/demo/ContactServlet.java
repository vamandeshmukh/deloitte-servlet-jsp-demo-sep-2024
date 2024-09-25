package com.deloitte.demo;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contact")
public class ContactServlet extends HttpServlet {

	private static final long serialVersionUID = -6960464501529842367L;

	// url -
	// http://localhost:8090/deloitte-servlet-demo/contact


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet method called.");
		RequestDispatcher dispatcher = request.getRequestDispatcher("contact.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost method called.");

		String subject = request.getParameter("subject");
		String message = request.getParameter("message");
		String email = request.getParameter("email");

		System.out.println("Subject: " + subject);
		System.out.println("Message: " + message);
		System.out.println("Email: " + email);

		request.setAttribute("messsage", "Thank you.");

		RequestDispatcher dispatcher = request.getRequestDispatcher("contact.jsp");
		dispatcher.forward(request, response);
	}
}

//package com.deloitte.demo;
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/contact")
//public class ContactServlet extends HttpServlet {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -6960464501529842367L;
//
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.service(req, resp);
//		System.out.println("service method called.");
//	}
//
//	@Override
//	public void destroy() {
//		super.destroy();
//		System.out.println("destroy method called.");
//	}
//
//	@Override
//	public void init() throws ServletException {
//		super.init();
//		System.out.println("init method called.");
//	}
//
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.out.println("doGet method called.");
//		RequestDispatcher dispatcher = request.getRequestDispatcher("contact.jsp");
//		dispatcher.forward(request, response);
//	}
//}

//package com.deloitte.demo;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/contact")
//public class ContactServlet extends HttpServlet {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -6960464501529842367L;
//
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.service(req, resp);
//		System.out.println("service method called.");
//	}
//
//	@Override
//	public void destroy() {
//		super.destroy();
//		System.out.println("destroy method called.");
//	}
//
//	@Override
//	public void init() throws ServletException {
//		super.init();
//		System.out.println("init method called.");
//	}
//
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.out.println("doGet method called.");
//		response.setContentType("text/html");
//		response.getWriter().println("<p>Contact us for more info.</p>");
//	}
//
//}
