package com.task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Prime
 */
@WebServlet("/prime")
public class Prime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Prime() {
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
		Integer n = Integer.valueOf(str);
	      PrintWriter out = response.getWriter();
	      int i,m=0,flag=0;      
	      m=n/2;      
	      if(n==0||n==1){  
	       out.println(n+" is not prime number");      
	      }else{  
	       for(i=2;i<=m;i++){      
	        if(n%i==0){      
	         out.println(n+" is not prime number");      
	         flag=1;      
	         break;      
	        }      
	       }      
	       if(flag==0)  { out.println(n+" is prime number"); }  
	      }//end of else  
	      
	}

}
