package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactServlet
 * 
 * This Servlet provides HTML response for contact information. Also, provides a 
 * form for user input to submit their contact information. Holds CSS formatting code
 * for Contact page.	
 */
@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Create new PrintWriter object
		final PrintWriter out = response.getWriter();
		
		// Gets ROOT URL context path
		final String webApplicationContext = getServletContext().getContextPath();
		
		// Create home, about and contact web pages. 
		out.append("<!doctype html>\n<html><head><title>Contact</title>");
		
		// NOTES: CSS Formatting
		out.append("\n<style> body "
				+ "{ background-color: #8A96B9; } "
				+ "h1 { text-align: center; } "
				+ "nav { text-align: center; } "
				+ "h2 { text-align: center; } "
				+ "p { text-align: center; } "
				+ "p { font-size: 125%; } "
				+ "h1 { border-style: solid; } "
				+ "h1 { border-top-style: none } ");
		
		out.append("</head>\n</style>\n<body>");
		
		// NOTES: Site Navigation for Home, About and Contact web pages
		out.append("\n\t<nav><a href=\"" + webApplicationContext + "/HomeServlet\">Home</a>"
				+ " - <a href=\"" + webApplicationContext + "/AboutServlet\">About</a>"
				+ " - <a href=\"" + webApplicationContext + "/ContactServlet\">Contact</a></nav>");
		
		out.append("<h1>Contact</h1>");
		
		// Travis' personal contact information
		out.append("<p><br><strong><u>Travis Cynor's Contact Information</u></strong>");
		out.append("<br>Phone Number: (123) 456-7890");
		out.append("<br>Email: tcynor4@student.cvtc.edu<br><br><br></p>");
		
		
		// Input for contact form submission
		out.append("<form action=\"#\">\n<fieldset>");
		out.append("<legend>Submit Your Contact Information</legend>\n");
		out.append("First Name:<br>\n ");
		out.append("<input type=\"text\" name=\"firstName\"><br>");
		out.append("Last Name:<br>\n ");
		out.append("<input type=\"text\" name=\"lastName\"><br>");
		out.append("Email:<br>\n ");
		out.append("<input type=\"text\" name=\"Email\"><br>");
		out.append("<input type=\"Submit\" name=\"submitButton\">");
		
		// Copyright
		out.append("<br><br><br><br><br><p>&copy; Copyright 2016 Travis Cynor</p>");
		
		out.append("\n</fieldset>\n</form>\n</body>\n</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
