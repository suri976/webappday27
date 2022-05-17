package ai.jobiak.http;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Context
 */
@WebServlet("/context")
public class Context extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Context() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		
		context.setAttribute("p1", "2");
		context.setAttribute("p2", "3");
		context.setAttribute("p3", "3");
		context.setAttribute("p4", "4");
		
		
		
		RequestDispatcher dispatcher =   context.getRequestDispatcher("/square");
		RequestDispatcher dispatcher2 =   context.getRequestDispatcher("/power");
		RequestDispatcher dispatcher3 =   context.getRequestDispatcher("/cube");
		RequestDispatcher dispatcher4 =   context.getRequestDispatcher("/squareRoot");
		
		dispatcher.forward(request, response);
		dispatcher2.forward(request, response);
		dispatcher3.forward(request, response);
		dispatcher4.forward(request, response);
		
	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
