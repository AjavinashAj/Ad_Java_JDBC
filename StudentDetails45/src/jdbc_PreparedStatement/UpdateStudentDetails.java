package jdbc_PreparedStatement;
import java.util.*;
import java.sql.*;
public class UpdateStudentDetails {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Student id");
			String sid=s.nextLine();
			System.out.println("Enter new Addresss");
			String saddr=s.nextLine();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			PreparedStatement ps=con.prepareStatement("update studentdetails45 set saddr=? where sid=?");
			
			ps.setString(1, saddr);
			ps.setString(2, sid);
			
			int k=ps.executeUpdate();
			if(k>0)
			{
				System.out.println("Updated successfully");
			}
			
			
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
