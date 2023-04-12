package com.nit.bike.preparedStatement;
import java.util.*;
import java.sql.*;
public class UpdateBike {

	public static void main(String[] args) {
		try {
			Scanner s =new Scanner(System.in);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			PreparedStatement ps=con.prepareStatement("update Bike45 set bname=? where cname=?");
			PreparedStatement ps1=con.prepareStatement("update bike45 set cname=? where bname=?");
			PreparedStatement ps2=con.prepareStatement("update bike45 set price=price+7000 where bname=?");
			PreparedStatement ps3=con.prepareStatement("update bike45 set qty=? where bname=?");
			while(true)
			{
				System.out.println("=====Update those you want=======");
				System.out.println("1.bike Name\n2.Company\n3.Bike price\n4.Bike Qty\n5.Exit");
				int choice=Integer.parseInt(s.nextLine());
				switch(choice)
				{
				    case 1:
				    	  System.out.println("Enter company name");
				    	  String cname=s.nextLine();
				    	  System.out.println("Enter new Bike name");
				    	  String bname=s.nextLine();
				    	  ps.setString(1, bname);
				    	  ps.setString(2, cname);
				    	  int k=ps.executeUpdate();
				    	  if(k>0)
				    	  {
				    		  System.out.println("Bike name change successfully....");
				    	  }
				    	  break;
				    	  
				    case 2:
				    	  System.out.println("Enter bike name");
				    	  String bname1=s.nextLine();
				    	  System.out.println("Enter new company name");
				    	  String cname1=s.nextLine();
				    	  
				    	  ps1.setString(1, cname1);
				    	  ps1.setString(2, bname1);
				    	  
				    	  int k1=ps1.executeUpdate();
				    	  if(k1>0)
				    	  {
				    		  System.out.println("company name change successfully...");
				    	  }
				    	  break;
				    case 3:
				    	 System.out.println("Enter Bike name");
				    	 String bname2=s.nextLine();
				    	
				    	  ps2.setString(1, bname2);
				    	  int k2=ps2.executeUpdate();
				    	  if(k2>0)
				    	  {
				    		  System.out.println("Bike price updated successfully......");
				    	  }
				    	  break;
				    case 4:
				    	System.out.println("Enter bike name");
				    	String bname3=s.nextLine();
				    	System.out.println("Enter bike Quantity");
				    	int bqty=Integer.parseInt(s.nextLine());
				    	ps3.setInt(1, bqty);
				    	ps3.setString(2, bname3);
				    	int k3=ps3.executeUpdate();
				    	if(k3>0)
				    	{
				    		System.out.println("bike qty updated successfully...");
				    	}
				    	break;
				    	
				    case 5:
				    	System.out.println("Application terminated successfully\n+++++Please come Again+++++");
				    	System.exit(0);
				    	  
				    default :
				    	 System.out.println("Invalid data....");
				    	 break;
				    
				
				}
				
			}
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
