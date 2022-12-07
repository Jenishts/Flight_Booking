package com.simplilearn.adminlogin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoginManager {
	
	Session session;
	Transaction tx;
	AdminLogin a2=null;
	
	
	public LoginManager(){
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		cfg.addAnnotatedClass(AdminLogin.class);
		SessionFactory factory=cfg.buildSessionFactory();
		
		session=factory.openSession();
		tx= session.beginTransaction();
	}
	
	public void createUser(String uName, String pass) {
		AdminLogin a1=new AdminLogin(uName, pass);
		System.out.println("User profile created");
		session.save(a1);
		session.close();
		tx.commit();
	}
	
	public boolean validiator(String uName, String pass) {
		
		a2= (AdminLogin)session.createQuery("from AdminLogin where UserName=:username").setParameter("username", uName).uniqueResult();
	
		if(a2!=null && a2.getPassword().equals(pass) ) {
			return true;
		}
		tx.commit();
		session.close();
		return false;
	
	
	}
	public boolean changePassword(String userName, String password) {
		
		a2= (AdminLogin)session.createQuery("from AdminLogin where UserName=:username").setParameter("username", userName).uniqueResult();
		
		if(a2!=null) {
		session.clear();
		a2=new AdminLogin(userName,password );
		session.saveOrUpdate(a2);
		session.getTransaction().commit();
		System.out.println("Password Changed...");
		session.close();
		return true;
		}else {
			System.out.println("User not exist");
			
		}
		return false;
	}
	
	
	

}
