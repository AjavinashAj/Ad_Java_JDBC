package jdbc_PreparedStatement;
import java.sql.*;
public class Create_UserReg45_table {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			PreparedStatement ps=con.prepareStatement
			("create table UserReg45(uname varchar2(10),pword varchar2(10),fname varchar2(10),lname varchar2(10),addr varchar2(15),mid varchar2(20),pno number(12))");
			System.out.println("Table created successfully.....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
