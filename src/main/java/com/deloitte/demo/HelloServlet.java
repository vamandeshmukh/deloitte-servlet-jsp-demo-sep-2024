package com.deloitte.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/", "/hello" })
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// url -
	// http://localhost:8090/deloitte-servlet-demo/hello

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request);
		response.setContentType("text/html");
		response.getWriter().println("<p>Hello world!</p>");
	}

}
