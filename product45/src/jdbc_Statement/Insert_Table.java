package jdbc_Statement;
import java.util.*;
import java.sql.*;
public class Insert_Table {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter product ID");
			String pid=s.nextLine();
			System.out.println("Enter product name");
			String pname=s.nextLine();
			System.out.println("Enter product price");
			int Pprice=Integer.parseInt(s.nextLine());
			System.out.println("Enter product no. of product");
			int pno=Integer.parseInt(s.nextLine());
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm =con.createStatement();
			
			int k=stm.executeUpdate("insert into product45 values('"+pid+"','"+pname+"',"+Pprice+","+pno+")");
			if(k>0)
			{
				System.out.println("insert into product45 successfull...");
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
