package com.gceylan.maventest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHeaders extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		
		Enumeration<String> requestHeaders = request.getHeaderNames();
		out.println("<ul>");
		
		while (requestHeaders.hasMoreElements()) {
			String headerName = requestHeaders.nextElement();
			out.println("<li><b>" + headerName + "</b> - "
					+ request.getHeader(headerName) + "</li>");
		}
		
		out.println("</ul>");
	}

}
