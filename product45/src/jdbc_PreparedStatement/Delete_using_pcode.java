package jdbc_PreparedStatement;
import java.sql.*;
import java.util.*;
public class Delete_using_pcode {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter PCode:");
			String pCode=s.nextLine();
			Connection con =DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			
			PreparedStatement ps1=con.prepareStatement
			("select * from product45 where pid=?");
			PreparedStatement ps2=con.prepareStatement
			("delete product45 where pid=?");
			ps1.setString(1, pCode);
			ResultSet rs=ps1.executeQuery();
			if(rs.next())
			{
				ps2.setString(1, pCode);
				int k=ps2.executeUpdate();
				if(k>0)
				{
					System.out.println("product details deleted...");
				}
				else
				{
					System.out.println("Invalid product code....");
				}
				s.close();
			}
					
			
		}
		catch(Exception e) {e.printStackTrace();}
	}

}
