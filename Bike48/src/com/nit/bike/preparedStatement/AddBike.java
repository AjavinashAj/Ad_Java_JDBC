package com.nit.bike.preparedStatement;
import java.util.*;
import java.sql.*;
public class AddBike {

	public static void main(String[] args) {
	try {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Bike name");
		String bname=s.nextLine();
		System.out.println("Enter Bike company name");
		String cname=s.nextLine();
		System.out.println("Enter bike price");
		float price=Float.parseFloat(s.nextLine());
		System.out.println("Enter bike qty");
		int qty=Integer.parseInt(s.nextLine());
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
		PreparedStatement ps=con.prepareStatement("insert into bike45 values(?,?,?,?)");
		
		
		ps.setString(1, bname);
		ps.setString(2,cname);
		ps.setFloat(3,price);
		ps.setInt(4, qty);
		int k=ps.executeUpdate();
		if(k>0)
		{
			System.out.println("Bike added successfull...");
		}
		
	}
	catch(Exception e) {e.printStackTrace();}

	}

}
