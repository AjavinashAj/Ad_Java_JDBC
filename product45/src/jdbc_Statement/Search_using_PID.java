package jdbc_Statement;
import java.sql.*;
import java.util.*;
public class Search_using_PID {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter product id");
			String pid=s.nextLine();
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("Select * from product45 where pid='"+pid+"'");
			if(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
			}
			else
			{
				System.out.println("invalid id.......");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
