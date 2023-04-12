//insert data into table
package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class Assigment2 {

	public static void main(String[] args) {
	try {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter book code");
		String bcode=s.nextLine();
		System.out.println("Enter book name ");
		String bname = s.nextLine();
		System.out.println("Enter name of Author");
		String bauthor =s.nextLine();
		System.out.println("Enter price of book");
		Float price=Float.parseFloat(s.nextLine());
		System.out.println("Enter book quantity");
		int bqty =Integer.parseInt(s.nextLine());
		
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","system","avinash");
		Statement stm =con.createStatement();
		
		int k=stm.executeUpdate("insert into BookDetails48 values('"+bcode+"','"+bname
				+"','"+bauthor+"',"+price+","+bqty+")");
		if(k>0) {
			System.out.println("Book details Updated Sucessfully......");
		}
		ResultSet rs =stm.executeQuery("select* from BookDetails48");
		while(rs.next()) {
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4)+"\t"+rs.getInt(5));
		}
		con.close();
		s.close();
	}catch(Exception e) {e.printStackTrace();}

	}

}
