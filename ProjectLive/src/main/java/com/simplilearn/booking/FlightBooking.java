package com.simplilearn.booking;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.simplilearn.HBDemo.Airline;

import com.simplilearn.HBDemo.PlacesList;

public class FlightBooking {


	Session session;
	Transaction tx;
	PlacesList p1;
	Airline a1;

	List<PlacesList> p1List=new ArrayList<PlacesList>();
	
	public FlightBooking() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		cfg.addAnnotatedClass(Airline.class);
		cfg.addAnnotatedClass(PlacesList.class);
		SessionFactory factory=cfg.buildSessionFactory();
		
		session=factory.openSession();
		tx= session.beginTransaction();
	}
	
	
	public void Plane(String source, String destiny, Date date, long price) {
		p1List.add(new PlacesList(source, destiny, date, price, a1));
		
	}
	
	public void Plane_Airline() {
//		p1.setAirline(a1);
		a1.setEmployee(p1List);
//		session.save(p1List);
		session.save(a1);
		tx.commit();
	}
	
	
	public void AirlineBrandName(String airlineNo) {
		a1=new Airline(airlineNo);
		
	}
	public void flightSave() {
		session.save(p1);
		session.save(a1);
		tx.commit();
	}
	 
	
	
}
