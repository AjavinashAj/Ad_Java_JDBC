package com.nit.bike;
import java.sql.*;
public class DisplayAllDetails {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery
		    ("select * from bike45");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
				
			}
			
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
