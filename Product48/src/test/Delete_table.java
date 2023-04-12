package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete_table {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm=con.createStatement();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.println("Enter Product Id");
				String id=br.readLine();
				int count =stm.executeUpdate("delete from product48 where pid="+id);
				if(count==1)
				{
					System.out.println("One product details delated successfully...");
				}
				else
				{
					System.out.println("Product Id not correct.....");
				}
				System.out.println("You want to delete product[yes/no]");
				String ch=br.readLine();
				if(ch.equalsIgnoreCase("no"))
					break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
