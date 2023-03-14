package com.agecalculator.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getdata")
public class AgeCalcuDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

	    String str1=request.getParameter("dateofbirth");
	    String str2=request.getParameter("currentdate");
	    
	    LocalDate date1=LocalDate.parse(str1);
	    LocalDate date2=LocalDate.parse(str2);
	    
	   
	    Period period=Period.between(date1, date2);

	    
	    long daysBetween=period.getDays()+(period.getMonths()*30)+(period.getYears()*365);
	    
	    long year=daysBetween/365;
	    long monts=(daysBetween%365)/30;
	    long days=(daysBetween%365)%30;
	    
	    

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
		+ "style=\"color:green;text-align:center\"> your age at this time is "
		+ year+" years "+monts+" months "+days+" days </h1>");
		pw.println("</div>");
		pw.println("</body>");
		pw.println("</html>");
			
	}

}
