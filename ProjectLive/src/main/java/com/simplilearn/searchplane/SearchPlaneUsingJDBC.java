package com.simplilearn.searchplane;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SearchPlaneUsingJDBC {
	Connection con;
	PreparedStatement stmt;
	
	public SearchPlaneUsingJDBC() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/John","root","root");  
		
	}
	
	
	public ResultSet rs(Date date, String source, String Destiny) throws SQLException {
		stmt=con.prepareStatement("select * from PlacesList where ? and ? and ? ");
		stmt.setDate(1, date);
		stmt.setString(2, source);
		stmt.setString(3, Destiny);		
		return stmt.executeQuery();
		
	}
	

}
