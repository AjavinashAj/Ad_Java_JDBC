package jdbc_PreparedStatement;
import java.sql.*;
public class DisplayAllStudentDetails {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			PreparedStatement ps=con.prepareStatement("select * from studentdetails45");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getFloat(5));
			}
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
