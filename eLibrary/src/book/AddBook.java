package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddBook {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Book id");
		String bId=s.nextLine();
		System.out.println("Enter Book name");
		String bname=s.nextLine();
		System.out.println("Enter  Author name");
		String bauthor=s.nextLine();
		System.out.println("Enter Book Price");
		Double bprice=Double.parseDouble(s.nextLine());
		System.out.println("Enter Book qty");
		Integer bqty=Integer.parseInt(s.nextLine());
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			PreparedStatement ps=con.prepareStatement("insert into book values(?,?,?,?,?)");
			ps.setString(1, bId);
			ps.setString(2, bname);
			ps.setString(3, bauthor);
			ps.setDouble(4, bprice);
			ps.setInt(5, bqty);
			int k=ps.executeUpdate();
			if(k>0)
			{
				System.out.println("book added succesfully....");
			}
			
		}catch(Exception e) {e.printStackTrace();}
		
	}

}
