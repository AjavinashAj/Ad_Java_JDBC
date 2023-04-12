package com.nit.bike.preparedStatement;
import java.sql.*;
import java.util.*;
public class DisplayByname {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Bike name");
			String bname=s.nextLine();
			PreparedStatement ps=con.prepareStatement("select * from bike45 where bname=?");
			ps.setString(1, bname);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
			}
			
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
