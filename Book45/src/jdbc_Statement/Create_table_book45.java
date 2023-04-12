package jdbc_Statement;
import java.sql.*;
public class Create_table_book45 {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm=con.createStatement();
			stm.executeQuery("create table book45 (bcode varchar2(4),bname varchar2(15),bauthor varchar2(15),bprice number(7),bqty number(3))");
			System.out.println("Book45 table created successfully....");
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
