package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 * 
 * This Servlet holds HTML response for Home page. Provides CSS formatting code 
 * for Home page as well. 
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 2L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// NOTES: Create new PrintWriter object for  response
		final PrintWriter out = response.getWriter();
		
		// Gets ROOT URL context path
		final String webApplicationContext = getServletContext().getContextPath();
		
		// NOTES: Writing output message for the About HTML page
		out.append("<!doctype html>\n<html>\n<head>\n\t<title>About</title>");
		
		// NOTES: CSS Formatting
		out.append("\n\t<style> body "
				+ "{ background-color: #8A96B9; }\n\t "
				+ "h1 { text-align: center; }\n\t "
				+ "nav { text-align: center; }\n\t "
				+ "h2 { text-align: center; }\n\t "
				+ "p { text-align: center; }\n\t "
				+ "p { font-size: 125%; }\n\t "
				+ "h1 { border-style: solid; }\n\t "
				+ "h1 { border-top-style: none } ");
		
		out.append("\n\t</style>\n</head>\n<body>");
		
		// NOTES: Site Navigation for Home, About and Contact pages
		out.append("\n\t<nav><a href=\"" + webApplicationContext + "/HomeServlet\">Home</a>"
				+ " - <a href=\"" + webApplicationContext + "/AboutServlet\">About</a>"
				+ " - <a href=\"" + webApplicationContext + "/ContactServlet\">Contact</a></nav>");
		
		out.append("<h1>Travis Cynor's Webpage!</h1>\n");
		out.append("<br><p>Welcome to Travis Cynor's personal webpage! <br>This website provides "
				+ "general information about Travis, and ways to contact him.</p>");
		out.append("<p>Feel free to come back for future updates and improvements to my website!</p>");
		out.append("<br><br><br><br><br><p>&copy; Copyright 2016 Travis Cynor</p>");
		out.append("\n</body>\n</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
