package jdbc_Statement;
import java.sql.*;
public class Select_Tabledetails {

	public static void main(String[] args) {
		try {
			Connection con =DriverManager.getConnection
		   ("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from employee45");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4)+"\t"+rs.getString(5));
				
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
