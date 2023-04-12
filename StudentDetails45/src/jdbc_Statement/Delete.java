package jdbc_Statement;
import java.util.*;
import java.sql.*;
public class Delete {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Student Id");
			String sid=s.nextLine();
			Statement stm=con.createStatement();
			int k=stm.executeUpdate("delete Studentdetails45 where sid='"+sid+"'");
			if(k>0)
			{
				System.out.println("Details deleted successfully....");
			}
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
