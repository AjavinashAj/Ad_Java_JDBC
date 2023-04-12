package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Select {

	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select * from emp1");
		System.out.println(" Id  Name  Salary");
		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			double sal=rs.getDouble(3);
			
			System.out.print(" "+id);
			System.out.print(" "+name);
			System.out.print(" "+sal+"\n");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
