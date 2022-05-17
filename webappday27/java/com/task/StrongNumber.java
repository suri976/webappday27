package com.task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StrongNumber
 */
@WebServlet("/strongnumber")
public class StrongNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StrongNumber() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String str = request.getParameter("value");
		int n=Integer.parseInt(str);  
		int i,rem,fact;
		int sum = 0;
		int temp = n;
		while(n != 0)
		{
		i = 1;
		fact = 1;
		rem = n % 10;

		while(i <= rem)
		{
		fact = fact * i;
		i++;
		}
		sum = sum + fact;
		n = n / 10;
		}

		if(sum == temp)
		out.println(temp + " is a strong number\n");
		else
		out.println(temp + " is not a strong number\n");
	}

}
