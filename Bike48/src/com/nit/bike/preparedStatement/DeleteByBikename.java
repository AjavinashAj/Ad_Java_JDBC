package com.nit.bike.preparedStatement;
import java.util.*;
import java.sql.*;
public class DeleteByBikename {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Bike name");
			String bname=s.nextLine();
			PreparedStatement ps=con.prepareStatement("delete  bike45 where bname=?");
			ps.setString(1, bname);
			int k=ps.executeUpdate();
			if(k>0)
			{
				System.out.println("deleted successfully...");
			}
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
