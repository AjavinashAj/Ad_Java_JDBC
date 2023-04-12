package jdbc_PreparedStatement;
import java.util.*;
import java.sql.*;
public class Insert_Table {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter emp id");
			String eid=s.nextLine();
			System.out.println("Enter emp name");
			String ename=s.nextLine();
			System.out.println("Enter emp designation");
			String edesg=s.nextLine();
			System.out.println("Enter emp basic salary");
			int bsal=Integer.parseInt(s.nextLine());
			float totsal=bsal+(0.93f*bsal) +(0.63f*bsal);
			Connection con =DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			PreparedStatement ps=con.prepareStatement("insert into  emp45 values(?,?,?,?,?)");
			ps.setString(1, eid);
			ps.setString(2, ename);
			ps.setString(3, edesg);
			ps.setInt(4, bsal);
			ps.setFloat(5, totsal);
			
			int k=ps.executeUpdate();
			if(k>0)
			{
				System.out.println("Inserted successfully......");
			}
			else
			{
				System.out.println("invalid data....");
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
