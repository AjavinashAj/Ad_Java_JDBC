package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_Table {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm =con.createStatement();
			ResultSet rs =stm.executeQuery("select * from product48");
			System.out.println("   PID   PNAME   PQTY   PPRICE");
			while(rs.next())
			{
				String id=rs.getString(1);
				String name=rs.getString(2);
				int qty=rs.getInt(3);
				double price=rs.getDouble(4);
				System.out.print("   "+id);
				System.out.print("   "+name);
				System.out.print("   "+qty);
				System.out.print("   "+price+"\n");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
