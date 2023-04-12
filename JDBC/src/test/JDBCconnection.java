package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCconnection {

	public static void main(String[] args) {
		try {
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			   Statement stm=con.createStatement();
			   stm.executeUpdate("create table emp1(eno number,ename varchar(12),esal number)");
			   System.out.println("Emp1 Table created successfully......");
			   con.close();
		    }
		    catch(Exception e)
		    {
		    	System.out.println(e);
		    }
		
	}

}
