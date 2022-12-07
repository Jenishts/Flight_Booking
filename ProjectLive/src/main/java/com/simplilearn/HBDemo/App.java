package com.simplilearn.HBDemo;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.simplilearn.adminlogin.LoginManager;
import com.simplilearn.booking.FlightBooking;
import com.simplilearn.booking.UBooking;
import com.simplilearn.searchplane.FindPlane;

public class App {
	
	
	private static java.sql.Date convert(java.util.Date uDate) {
		 java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		 return sDate;
		 }
	
	
	public static void main(String[] args) throws ParseException {
		
//		
//		String dateStr = "2022-12-04"; 
//		SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd"); 

		
//		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
//		
//		java.util.Date date = dt.parse(dateStr);
//		System.out.println(date.toString());
		
//		FlightBooking f1=new FlightBooking();
//		f1.AirlineBrandName("AirIndia");
//		f1.Plane("Andaman and Nicobar Islands", "Andhra Pradesh", new java.sql.Date(System.currentTimeMillis()), 25000);
//		f1.Plane("Andhra Pradesh", "Assam", new java.sql.Date(System.currentTimeMillis()), 6500);
//		f1.Plane("Assam", "Delhi", new java.sql.Date(System.currentTimeMillis()), 6500);
//	
//		f1.Plane_Airline();
//		java.util.Date utilDate = new java.util.Date();
//		 System.out.println("java.util.Date is : " + utilDate);
		

		
		LoginManager lm=new LoginManager();
//		
//		lm.createUser("Jenish", "Pass");
		lm.changePassword("Jenish", "Google");
		
		
//		FindPlane f2=new FindPlane();
//		f2.list(convert(date), "Kerala","Kerala" );
//		
	
		
		
//		UBooking b1=new UBooking();
//		
//		b1.AirBook("Mac", 30,new java.sql.Date(System.currentTimeMillis()), 54122, 1);
//
//		b1.AirBook("Jenish", 30, new java.sql.Date(System.currentTimeMillis()), 56646545, 14);
		
		
		
		
	}

}
