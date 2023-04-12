package jdbc_PreparedStatement;
import java.sql.*;
import java.util.*;
public class DeleteDetails {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Student id");
			String sid=s.nextLine();
			PreparedStatement ps=con.prepareStatement
			("delete studentdetails45 where sid=?");
			ps.setString(1, sid);
			int k=ps.executeUpdate();
			if(k>0)
			{
				System.out.println("Details Delated...");
			}
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
