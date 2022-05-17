package com.task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Gcd
 */
@WebServlet("/gcd")
public class Gcd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gcd() {
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
		String str = request.getParameter("value");
		String str2 = request.getParameter("value1");
		Integer x = Integer.valueOf(str);
		Integer y = Integer.valueOf(str2);
	      PrintWriter out = response.getWriter();
	      int gcd=1;
	      for(int i = 1; i <= x && i <= y; i++)  
	      {  
	      //returns true if both conditions are satisfied   
	      if(x%i==0 && y%i==0)  
	      //storing the variable i in the variable gcd  
	      gcd = i;  
	      }  
	      //prints the gcd  
	      System.out.printf("GCD of "+ str +","+str2+"is  " +gcd);  
	      }  
	      
	      
	

}
