package com.simplilearn.HBDemo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Booking_No")
	private int ID;
	@Column(name = "NoOfSeats")
	private int noOfSeats;
	
	@Column(name = "P_Date")
	private Date date;
	
//	@Column(name = "Plane_Number")
//	private int planeNo; 

	
	@OneToOne(targetEntity=Passanger.class)  
	private Passanger pass;
	
	public Booking(int noOfSeats, Date date, Passanger pass) {
		super();
		this.noOfSeats = noOfSeats;
		this.date = date;
		this.pass = pass;
	}
	public Booking() {
		super();
	
	}
	
	

//	public int getPlaneNo() {
//		return planeNo;
//	}
//	public void setPlaneNo(int planeNo) {
//		this.planeNo = planeNo;
//	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Passanger getPass() {
		return pass;
	}

	public void setPass(Passanger pass) {
		this.pass = pass;
	}
	
	
	
	

}
