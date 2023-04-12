package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try {
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			  Statement stm=con.createStatement();
			  stm.executeQuery("create table product48(pid varchar2(5),pname varchar2(15),pqty number(3),pprice number(7,2))");
			  System.out.println("Table created successfully.....");
	    	}
		    catch(Exception e)
		    {
		       System.out.println(e);	
		    }

	}

}
