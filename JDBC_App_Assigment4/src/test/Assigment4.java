package test;

import java.sql.*;
import java.util.*;
public class Assigment4 {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the bcode");
			String BCODE=s.nextLine();
			System.out.println("enter the name");
			String BNAME =s.nextLine();
			System.out.println("enter the author");
			String BAUTHOR =s.nextLine();
			System.out.println("enter the price");
			float PRICE=Float.parseFloat(s.nextLine());
			System.out.println("enter the Quantity");
			int BQTY =Integer.parseInt(s.nextLine());
			Connection con =DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","c##avi","avinash");
			PreparedStatement ps1 =con.prepareStatement("select*from BookDetails48 where BCODE='"+BCODE+"'");
			Statement stm=con.createStatement();
			int k=stm.executeUpdate("insert into BookDetails48 values('"+BCODE+"','"+BNAME
					+"','"+BAUTHOR+"',"+PRICE+","+BQTY+")");
			if(k>0) {
				
				System.out.println("BookDetails are inserted Sucessfully......");
			}
			ResultSet rs=stm.executeQuery("select * from BookDetails48");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)
				+"\t"+rs.getString(3)+"\t"+rs.getFloat(4)+"\t"+rs.getInt(5));
			}
			
			con.close();
			s.close();
		}catch(Exception e) {e.printStackTrace();}

	}

}
