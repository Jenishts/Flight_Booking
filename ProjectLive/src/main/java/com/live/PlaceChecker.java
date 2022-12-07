package com.live;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilearn.HBDemo.PlacesList;
import com.simplilearn.booking.UBooking;
import com.simplilearn.searchplane.FindPlane;
import com.simplilearn.searchplane.SearchPlaneUsingJDBC;

/**
 * Servlet implementation class PlaceChecker
 */
@WebServlet("/PlaceChecker")
public class PlaceChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlaceChecker() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int flightno=0;
		RequestDispatcher rd=request.getRequestDispatcher("Home.html");
		String source=request.getParameter("Source");
		String Destiny=request.getParameter("Destiny");
		String date=request.getParameter("date");
	
		System.out.println("Date is: " + date);
		System.out.println("source is: " + source);
		System.out.println("Destiny is: " + Destiny);
		Date parsed = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        HttpSession session=request.getSession(); 
        

		try {
			parsed = format.parse(date);
			System.out.println(parsed);
			session.setAttribute("p_date", parsed);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		List l2 = null;
		if(parsed==null) {
			rd.forward(request, response);
		}else {
			FindPlane f2=new FindPlane();
			l2=f2.list(f2.convert(parsed), Destiny,source );
		}
		PrintWriter out1=response.getWriter();
		if(l2.isEmpty()) {
			out1.print("<h1 style='color: red'>");
			out1.print("No flight Available");
			out1.print("<h1>");
			rd.include(request, response);
		}else {
			for(Object l1: l2) {
				out1.print("<h1>");
				out1.println(l1.toString());
				out1.print("</h1>");
				
				
			
			}
			out1.print("<a href=\"./Register.html\">Book Now</a>");
			rd.include(request, response);
		
		}
		
		
		
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
