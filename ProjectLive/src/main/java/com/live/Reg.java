package com.live;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilearn.HBDemo.App;
import com.simplilearn.booking.UBooking;


@WebServlet("/Reg")
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Reg() {
        super();
       
    }

	


	
	
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UBooking b1=new UBooking();
		PrintWriter out=response.getWriter();
		
		RequestDispatcher rd=request.getRequestDispatcher("Home.html");


		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		
		
		long cardNumber=Long.parseLong(request.getParameter("cardNumber"));
		int No_of_P=Integer.parseInt(request.getParameter("No_of_P"));
        HttpSession session=request.getSession(false); 
        Date dt=(Date) session.getAttribute("p_date");

		System.out.println(dt);
		b1.AirBook(name, age, UBooking.convert(dt), cardNumber, No_of_P);
//		response.sendRedirect("Register.html");
		out.print("");
		out.print("<h1> Details :: <h1/> ");
		out.print("<h1> Name : "+ name + " <h1/> ");
		out.print("<h1> Age : "+ age + " <h1/> ");
		out.print("<h1> CardNumber : "+ cardNumber + " <h1/> ");
		out.print("<h1> Date : "+ dt + " <h1/> ");
		rd=request.getRequestDispatcher("Home.html");
		rd.include(request, response);
//		out.print("<a href=\"./Home.html\">Back to Home</a>");
		
	}

}
