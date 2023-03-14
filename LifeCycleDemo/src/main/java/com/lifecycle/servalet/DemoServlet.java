package com.lifecycle.servalet;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


public class DemoServlet extends GenericServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() called");
	}

	
	
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service() called");	}


public void destroy() {
	
	System.out.println("delet() called");
}
}