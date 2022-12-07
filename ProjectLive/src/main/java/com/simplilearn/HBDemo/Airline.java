package com.simplilearn.HBDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Airline {
	
	@Id
	@Column(name = "Airline_Name")
	private String airlineName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "airline")
	private List<PlacesList> employee = new ArrayList<>();
	
	public Airline(String airlineNo, List<PlacesList> employee) {
		super();
		this.airlineName = airlineNo;
		this.employee = employee;
	}
	public Airline(String airlineNo) {
		super();
		this.airlineName = airlineNo;

	}












	public List<PlacesList> getEmployee() {
		return employee;
	}



	public void setEmployee(List<PlacesList> employee) {
		this.employee = employee;
	}



	
	
	
	
	public Airline() {
				
	}
	
	

	
	
	

}
