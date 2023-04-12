package test;
import java.sql.*;
public class DemoConn {

	public static void main(String[] args) {
		try
		{
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##avi","avinash");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getFloat(6)+"\t"+rs.getInt(7)+"\t"+rs.getInt(8));
			}
		}catch(Exception e) {e.printStackTrace();}

	}

}
