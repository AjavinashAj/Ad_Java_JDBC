//Display data of table
package test;
import java.sql.*;
public class Assigment1 {

	public static void main(String[] args) {
		try{
	        Connection con = DriverManager.getConnection
	        		("jdbc:oracle:thin:@localhost:1521:orcl","system","avinash");
	        Statement stm =con.createStatement();
	        ResultSet rs = stm.executeQuery("select *from BookDetails48");
	        while(rs.next())
	        {
	        	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4)+"\t"+rs.getFloat(5));
	        }
	        
	        con.close();
	        
		}catch(Exception e) {e.printStackTrace();}

	}

}
