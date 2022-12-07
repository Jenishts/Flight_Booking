package com.simplilearn.booking;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.simplilearn.HBDemo.Booking;
import com.simplilearn.HBDemo.Passanger;

public class UBooking {

	Session session;
	Transaction tx;
	
	public UBooking()
		{
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		cfg.addAnnotatedClass(Passanger.class);
		cfg.addAnnotatedClass(Booking.class);
		SessionFactory factory=cfg.buildSessionFactory();
		
		session=factory.openSession();
		tx= session.beginTransaction();
		
		}
		
		
	public void AirBook(String name, int age, Date date, long cardNumber, int noOfSeats) {
		Passanger p1=new Passanger(name, age, date, cardNumber);
		Booking b1=new Booking(noOfSeats, date, p1);
		p1.setBooking(b1);
		System.out.print("Data Inserted...");
		session.save(p1);
		session.save(b1);
		
		tx.commit();

	}
	public static java.sql.Date convert(java.util.Date uDate) {
		 java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		 return sDate;
		 }
	
	
	
}
