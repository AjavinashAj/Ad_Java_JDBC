package jdbc_Statement;
import java.util.*;
import java.sql.*;
public class Search_row_using_bcode {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter book code");
			String bcode=s.nextLine();
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from book45 where bcode='"+bcode+"'");
			if(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4)+"\t"+rs.getInt(5));
			}
			else
			{
				System.out.println("invalid code....");
			}
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
