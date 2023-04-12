//show particular details from table using code number
package test;
import java.sql.*;
import java.util.Scanner;
public class Assigment3 {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the productCode:");
			String bcode =s.nextLine();
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","c##avi","avinash");
			Statement stm =con.createStatement();
			ResultSet rs=stm.executeQuery
					("select*from BookDetails48 where bcode='"+bcode+"'");
			if(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)
				+"\t"+rs.getFloat(4)+"\t"+rs.getInt(5));
			}
			else
			{
				System.out.println("Invalid Book code.......");
			}
			con.close();
			s.close();
			 
		}catch(Exception e) {e.printStackTrace();}

	}

}
