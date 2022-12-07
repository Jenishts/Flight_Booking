package com.simplilearn.searchplane;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.simplilearn.HBDemo.Airline;
import com.simplilearn.HBDemo.PlacesList;

public class FindPlane {
	
	Session session;
	Transaction tx;
	

	List<PlacesList> p1List=new ArrayList<PlacesList>();
	
	public FindPlane() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		cfg.addAnnotatedClass(Airline.class);
		cfg.addAnnotatedClass(PlacesList.class);
		SessionFactory factory=cfg.buildSessionFactory();
		
		session=factory.openSession();
		tx= session.beginTransaction();
	}
	
	
	
	public List list(Date date, String source, String Destiny){
		
		
		Query query = session.createQuery("from PlacesList where date=:date and source=:source and Destiny=:Destiny ").setParameter("date", date).setParameter("source", source).setParameter("Destiny", Destiny);
		return query.list();
		
//		Query query1 = session.createQuery("SELECT COUNT(*) from PlacesList");
//		System.out.println((Long)query1.uniqueResult());

	}
	public java.sql.Date convert(java.util.Date uDate) {
		 java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		 return sDate;
		 }

}
