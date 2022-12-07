package com.simplilearn.HBDemo;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passanger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "UserID_No")
	private int ID;
	@Column(name = "P_Name")
	private String name;
	@Column(name = "P_Age")
	private int Age;
	@Column(name = "P_Date")
	private Date date;
	@Column(name = "P_CardNumber")
	private long cardNumber;
	
	@OneToOne(targetEntity=Booking.class,cascade=CascadeType.ALL)  
	private Booking booking;
	
	public Passanger( ) {
		
	}
	
	
	
	
	public Passanger( String name, int age, Date date, long cardNumber) {
	
		
		this.name = name;
		Age = age;
		this.date = date;
		this.cardNumber = cardNumber;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	
	
	
	
	

}
