package jdbc_Statement;
import java.sql.*;
import java.util.*;
public class AddStudent {

	public static void main(String[] args) {
		try {
			while(true)
			{
			Scanner s=new Scanner(System.in);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm=con.createStatement();
			System.out.println("Enter Student id");
			String sid=s.nextLine();
			System.out.println("Enter student name");
			String sname=s.nextLine();
			System.out.println("Enter School Name");
			String school=s.nextLine();
			System.out.println("Enter School Address");
			String sAddr=s.nextLine();
			System.out.println("Enter Student percentage");
			double sper=Double.parseDouble(s.nextLine());
			int k=stm.executeUpdate("insert into studentdetails45 values('"+sid+"','"+sname+"','"+school+"','"+sAddr+"',"+sper+")");
			if(k>0)
			{
				System.out.println("Student details added Successfully....");
			}
			}	
		}
		catch(Exception e) {e.printStackTrace();}
	}

}
