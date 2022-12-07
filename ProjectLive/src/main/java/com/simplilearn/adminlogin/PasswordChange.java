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
 * Servlet implementation class PasswordChange
 */
@WebServlet("/PasswordChange")
public class PasswordChange extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasswordChange() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("user");
		String pass=request.getParameter("pass");
		
		RequestDispatcher rd=request.getRequestDispatcher("admin.html");
		
		PrintWriter out=response.getWriter();
		
		LoginManager lm=new LoginManager();
//		System.out.println(name);
//		System.out.println(pass);
		
		if(lm.changePassword(name, pass)) {
		
			
			out.print("<h1>Password has been changed...</h1>");
			rd.include(request, response);
		}else {
			out.print("<h1>UserID not found...</h1>");
			rd.include(request, response);
		}
		
		
	}

}
