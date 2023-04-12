package com.nit.bike;
import java.sql.*;
public class create_table {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm=con.createStatement();
			stm.executeUpdate("create table Bike45(bname varchar2(15),cname varchar2(10),price number(7,2),qty number(3))");
			System.out.println("Table created successfully.....");
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
