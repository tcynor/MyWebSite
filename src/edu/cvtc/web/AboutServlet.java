package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AboutServlet
 * 
 * This Servlet provides HTML response about Travis and controls CSS formatting code 
 * the About page
 */
@WebServlet("/AboutServlet")
public class AboutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// NOTES: Create new PrintWriter object for response
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
		
		out.append("\n\t</style>\n</head>\n\t<body>");
		
		// NOTES: Site Navigation for Home, About and Contact web pages
		out.append("\n\t\t<nav><a href=\"" + webApplicationContext + "/HomeServlet\">Home</a>"
				+ "\n\t\t - <a href=\"" + webApplicationContext + "/AboutServlet\">About</a>"
				+ " - <a href=\"" + webApplicationContext + "/ContactServlet\">Contact</a></nav>");
		
		out.append("\n\t\t<h1>About</h1>\n");

		out.append("\n\t\t<p>Hello! My name is Travis Cynor. I grew up in Lake Holcombe, WI, and currently reside in "
				+ "Fall Creek, WI. I am married to my wonderful wife Brittany of two years, and we have a precious 16-month old girl, Skylar.</p><p>"
				+ "In my professional career, I graduated from the University of Wisconsin-Eau Claire in 2012 with a Bachelor&#39s degree "
				+ "in Information Systems - Business Analysis emphasis. I&#39ve been employed at a Mobile Device Management software company, Jamf, "
				+ "for the past 5 years, and currently hold a position as a Systems Engineer within Jamf&#39s Research department. At Jamf, we only do MDM "
				+ "for Apple platforms. Our mission is simple, but effective: \"We help organizations succeed with the Apple platform.\"</p><p> " 
				+ " Recently, I chose to go back to school at Chippewa Valley Technical College for Java programming to build onto my technical skill sets, "
				+ "and figure out my next steps for education. After this program I&#39ll either go back to school for a second undergrad, "
				+ "but this time in Software Engineering, or go back for my Masters.</p><p> "
				+ "In my time away from the busyness, I enjoy spending time with family, playing basketball and partaking in any activity that involves being outdoors. "
				+ "Over the last three years I&#39ve developed a passion for archery hunting, and love all the prep work that goes into the hunting seasons. "
				+ "My next bow hunting goal is to go on a bear and elk hunt.</p>"
				+ "<p>Thank you for learning a little about me!<p>");		
		out.append("<br><br><br><br><p>&copy; Copyright 2016 Travis Cynor</p>");
		out.append("\n</body>\n</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
