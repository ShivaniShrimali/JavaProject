package com.assinenetcookydemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getservlet")
public class GetServletAss extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		Cookie[] arr = request.getCookies();
		
		String uname = "" , usite = "";
		
		for(Cookie c : arr) {
			if(c.getName().equals("namecooky"))
				uname = c.getValue();
			
			if(c.getName().equals("sitecooky"))
				usite = c.getValue();
		}
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		pw.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
		pw.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>");
		pw.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<div class=\"container\">");
		pw.println("<h1 "
		+ "style=\"color:green;text-align:center\"> DATA"
		+ " FROM COOKIES :- </h1>");
		pw.println("<h2 "
		+ "style=\"color:slateblue\"> Your name : " + uname
		+ "</h2>");
		pw.println("<h2 "
		+ "style=\"color:slateblue\"> Your favorite site : "
		+ usite + "</h2>");
		pw.println("</div>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
