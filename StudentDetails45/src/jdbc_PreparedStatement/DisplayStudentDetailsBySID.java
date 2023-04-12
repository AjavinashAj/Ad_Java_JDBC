package jdbc_PreparedStatement;
import java.sql.*;
import java.util.*;
public class DisplayStudentDetailsBySID {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Scanner s= new Scanner(System.in);
			System.out.println("Enter Student id");
			String sid=s.nextLine();
			PreparedStatement ps =con.prepareStatement
			("select * from studentdetails45 where sid=?");
			ps.setString(1, sid);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getFloat(5));
			}
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
