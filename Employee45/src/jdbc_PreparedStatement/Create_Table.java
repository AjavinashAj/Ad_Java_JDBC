package jdbc_PreparedStatement;
import java.sql.*;
public class Create_Table {

	public static void main(String[] args) {
		try {
			Connection con =DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			PreparedStatement ps=con.prepareStatement("create table Emp45 (eid varchar2(10),ename varchar2(15),edesg varchar2(10),bsal number(10),totsal number(10,2),primary key(eid))");
			
			System.out.println("Table created successfully....");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
