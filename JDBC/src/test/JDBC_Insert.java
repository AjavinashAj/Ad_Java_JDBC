package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Insert {

	public static void main(String[] args) {
		try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			 PreparedStatement psmt=con.prepareStatement("insert into emp1 values(?,?,?)");
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			 while(true)
			 {
				 System.out.println("Enter Employ ID");
				 int id=Integer.parseInt(br.readLine());
				 System.out.println("Enter Employ Name");
				 String name=br.readLine();
				 System.out.println("Enter Employ Salary");
				 double sal=Double.parseDouble(br.readLine());
				 psmt.setInt(1, id);
				 psmt.setString(2, name);
				 psmt.setDouble(3, sal);
				 int count =psmt.executeUpdate();
				 if(count>0)
				 {
					 System.out.println("One Record Inserted....");
				 }
				 else
				 {
					 System.out.println("NO Record Inserted....");
				 }
				 System.out.println("Do you want to store More Records[yes/No]");
				 String ch=br.readLine();
				 if(ch.equalsIgnoreCase("No"))
				 break;
			 }
		    }
	        catch(Exception e)
		   {
	          System.out.println(e); 	
		   }

	}

}
