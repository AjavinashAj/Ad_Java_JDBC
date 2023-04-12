package jdbc_PreparedStatement;
import java.sql.*;
import java.util.*;
public class AddStudentDetails {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Student id");
			String sid=s.nextLine();
			System.out.println("Enter Student name");
			String sname=s.nextLine();
			System.out.println("Enter Student school name ");
			String school=s.nextLine();
			System.out.println("Enter School Address");
			String sAddr=s.nextLine();
			System.out.println("Enter student percentage");
			double sper=Double.parseDouble(s.nextLine());
			PreparedStatement ps=con.prepareStatement
			("insert into Studentdetails45 values(?,?,?,?,?)");
			
			ps.setString(1, sid);
			ps.setString(2, sname);
			ps.setString(3, school);
			ps.setString(4, sAddr);
			ps.setDouble(5, sper);
			int k=ps.executeUpdate();
			if(k>0)
			{
				System.out.println("Add details successfully....");
			}
		}
		catch(Exception e) {e.printStackTrace();}
	}

}
