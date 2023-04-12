package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update_table {

	public static void main(String[] args) {
		String value;int qty;double price; String id;String name;int count=0;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm =con.createStatement();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{   
				System.out.println("Enter What you want to Update\n1.PName\n2.PID\n3.PQTY\n4.PPrice");
				switch(Integer.parseInt(br.readLine()))
				{
				case 1:
					  System.out.println("Enter Product Id");
					  id=br.readLine();
					  System.out.println("Enter New Product Name");
					  name=br.readLine();
					   count=stm.executeUpdate("update product48 set pname="+name+"where pid="+id);
					  
				case 2:
					   System.out.println("Enter Product Name");
					   name=br.readLine();
					   System.out.println("Enter New Product Id");
					   id=br.readLine();
					    count=stm.executeUpdate("update product48 set pid="+id+"where pname="+name);
				case 3:
					   System.out.println("Enter Product Id");
					   id=br.readLine();
					   System.out.println("Enter New Product Quantity");
					   value=br.readLine();
					   qty=Integer.parseInt(value);
					    count=stm.executeUpdate("update product48 set pqty="+qty+"where pid="+id);
				case 4:
					  System.out.println("Enter Product Id");
					  id=br.readLine();
					  System.out.println("Enter New Product Price");
					  value=br.readLine();
					  price=Double.parseDouble(value);
					  count=stm.executeUpdate("update product48 set pprice="+price+"where pid="+id);
					
				}
				if(count>0)
				{
					System.out.println("Product updated Successfully....");
				}
				else
				{
					System.out.println("Product not Updated......");
				}
				System.out.println("Do You want to update[yes/no]");
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
