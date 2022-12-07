package com.simplilearn.adminlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginChecker
 */
@WebServlet("/LoginChecker")
public class LoginChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginChecker() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("admin.html");
		
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uid");
		String pass=request.getParameter("pass");
		RequestDispatcher rd=null;
	
		PrintWriter out=response.getWriter();
		
		LoginManager lm=new LoginManager();
		
		
		if(lm.validiator(name, pass)) {
//			rd=request.getRequestDispatcher("WelcomePage");
//			rd.forward(request, response);
			out.print("Login done");
		}else {
			rd=request.getRequestDispatcher("admin.html");
			rd.include(request, response);
			
			out.print("<h1>Invalid Credentials</h1>");

		}
		
		
	
	}

}
