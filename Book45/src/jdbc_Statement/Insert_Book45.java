package jdbc_Statement;
import java.sql.*;
import java.util.*;
public class Insert_Book45 {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Book code");
			String bcode=s.nextLine();
			System.out.println("Enter book name");
			String bname=s.nextLine();
			System.out.println("Enter book author name");
			String bauthor=s.nextLine();
			System.out.println("Enter bookprice");
			float bprice=Float.parseFloat(s.nextLine());
			System.out.println("Enter book quantity");
			int bqty=Integer.parseInt(s.nextLine());
			Connection con =DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm=con.createStatement();
			int k=stm.executeUpdate("insert into book45 values('"+bcode+"','"+bname+"','"+bauthor+"',"+bprice+","+bqty+")");
			if(k>0)
			{
				System.out.println("insert book45 successfully...");
			}
			else
			{
				System.out.println("invalid......");
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
