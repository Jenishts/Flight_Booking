package com.simplilearn.HBDemo;

import java.sql.Date;


import javax.persistence.*;



@Entity

public class PlacesList {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Flight_No")
	private int flightNo;
	
	@Column(name = "Source")
	private String source;
	
	@Column(name = "Destiny")
	private String destiny;
	
	@Column(name="Journey_Date")
	private Date date;
	
	@Column(name="Journey_Price")
	private long price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Airline_Name")
	private Airline airline;

	public PlacesList(String source, String destiny, Date date, long price) {
		super();
		this.source = source;
		this.destiny = destiny;
		this.date = date;
		this.price = price;
	}

	
	

	@Override
	public String toString() {
		return "Flight No =" + flightNo + ", Source =" + source + ", Destiny =" + destiny + ", Date =" + date
				+ ", Price =" + price + ".";
	}

	public PlacesList() {
		super();
	
	
	}


	public PlacesList(String source, String destiny, Date date, long price, Airline airline) {
		super();
	
		this.source = source;
		this.destiny = destiny;
		this.date = date;
		this.price = price;
		this.airline = airline;
	}




	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestiny() {
		return destiny;
	}

	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	
	
	
	
	
	
	
	

}
