package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_Table {

	public static void main(String[] args) {
		try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			 PreparedStatement pstm=con.prepareStatement("insert into product48 values(?,?,?,?)");
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			 while(true)
			 {
				 System.out.println("Enter Product Id");
				 String id=br.readLine();
				 System.out.println("Enter Product Name");
				 String name=br.readLine();
				 System.out.println("Enter Product Quantity");
				 int qty=Integer.parseInt(br.readLine());
				 System.out.println("Enter Product Price");
				 double price=Double.parseDouble(br.readLine());
				 pstm.setString(1,id);
				 pstm.setString(2,name);
				 pstm.setInt(3, qty);
				 pstm.setDouble(4, price);
				 int count =pstm.executeUpdate();
				 if(count>0)
				 {
					 System.out.println("One Record Inserted.....");
				 }
				 else
				 {
					 System.out.println("No Record Inserted......");
				 }
				 System.out.println("Do you want to Insert [yes/no]");
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
