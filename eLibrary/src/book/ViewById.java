package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ViewById {
	public static void main(String[]args) {
		try {
			Scanner s=new Scanner(System.in);
			String bId=s.nextLine();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			PreparedStatement ps=con.prepareStatement("select * from book where id=?");
			ResultSet rs=ps.executeQuery();
			//Book ob=new Book();
			ps.setString(1, bId);
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
				
			}
			
			
			con.close();
		}
		catch(Exception e) {e.printStackTrace();};

	}
	

}
