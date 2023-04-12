package jdbc_Statement;
import java.sql.*;
public class Create_table {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm=con.createStatement();
			stm.executeQuery("create table employee45 (eid varchar2(4),ename varchar2(15),edesig varchar2(10),esal number(7),edoj date)");
			System.out.println("Table created successfully....");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
