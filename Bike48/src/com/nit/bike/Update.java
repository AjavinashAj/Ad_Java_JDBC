package com.nit.bike;
import java.sql.*;
import java.util.*;
public class Update {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Bike name");
			String bname=s.nextLine();
			System.out.println("Enter new Bike price");
			float newprice=Float.parseFloat(s.nextLine());
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm=con.createStatement();
			int k=stm.executeUpdate("update for bike45 set price=price+newprice where bname='"+bname+"'");
		}
		catch(Exception e) {e.printStackTrace();}
		
	}

}
