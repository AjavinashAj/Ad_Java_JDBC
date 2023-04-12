package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_table {
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm =con.createStatement();
			stm.executeUpdate("create table BookDetails48(bcode varchar2(5),bname varchar2(15),bauthor varchar2(15),price number(4),bqty number(3) ) ");
			System.out.println("Table created successfully.....");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
