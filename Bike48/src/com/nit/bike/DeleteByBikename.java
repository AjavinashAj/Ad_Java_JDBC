package com.nit.bike;
import java.util.*;
import java.sql.*;
public class DeleteByBikename {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			System.out.println("Enter Bike name");
			String bname=s.nextLine();
			Statement stm=con.createStatement();
			int k=stm.executeUpdate("delete bike45 where bname='"+bname+"'");
			if(k>0)
			{
				System.out.println(bname+"deleted successfully....");
			}
		}
		catch(Exception e) {e.printStackTrace();}
	}

}
