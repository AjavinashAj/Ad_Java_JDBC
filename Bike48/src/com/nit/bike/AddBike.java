package com.nit.bike;
import java.sql.*;
import java.util.*;
public class AddBike {

	public static void main(String[] args) {
         try {
        	 while(true)
        	 {
        	 Scanner s=new Scanner(System.in);
        	 System.out.println("Enter Bike name");
        	 String bname=s.nextLine();
        	 System.out.println("Enter bike company name");
        	 String cname=s.nextLine();
        	 System.out.println("Enter bike price");
        	 float price=Float.parseFloat(s.nextLine());
        	 System.out.println("Enter bike quantity");
        	 int qty=Integer.parseInt(s.nextLine());
        	 Class.forName("oracle.jdbc.driver.OracleDriver");
        	 Connection con=DriverManager.getConnection
        	("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
        	 Statement stm=con.createStatement();
        	 int k=stm.executeUpdate("insert into bike45 values('"+bname+"','"+cname+"',"+price+","+qty+")");
        	 if(k>0)
        	 {
        		 System.out.println("Bike added successfully....");
        	 }
        	 } 
         }
         catch(Exception e) {e.printStackTrace();}
	}

}
