package jdbc_Statement;
import java.sql.*;
public class Create_table {

	public static void main(String[] args) {
		try {
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
		Statement stm=con.createStatement();
		stm.executeQuery("create table product46 (pid varchar2(4),pname varchar2(15),pprice number(5),pqty number(3))");
		System.out.println("Table created successfully....");
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
 }  
}
