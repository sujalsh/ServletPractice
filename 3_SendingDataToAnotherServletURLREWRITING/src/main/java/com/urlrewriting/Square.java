package com.urlrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/square")
public class Square extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int result = Integer.parseInt(req.getParameter("result"));
		result = result*result;
		PrintWriter out = res.getWriter();
		out.println("Result is "+result);
	}

}
