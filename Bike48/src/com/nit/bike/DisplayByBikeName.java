package com.nit.bike;
import java.sql.*;
import java.util.*;
public class DisplayByBikeName {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Book name");
			String bname=s.nextLine();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from bike45 where bname='"+bname+"'");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
			}
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
