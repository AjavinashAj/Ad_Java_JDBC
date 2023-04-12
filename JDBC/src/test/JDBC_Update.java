package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JDBC_Update {

	public static void main(String[] args) {
		String value; int id;double sal;
		try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			 Statement stm=con.createStatement();
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
				 System.out.println("Enter Employ ID");
				 value=br.readLine();
				 id=Integer.parseInt(value);
				 System.out.println("Enter Employ  new Salary");
				 value=br.readLine();
				  sal=Double.parseDouble(value);
				int count=stm.executeUpdate("update emp1 set esal="+sal+"where eno="+id);
				if(count>0)
				{
					System.out.println("One record updated");
				}
				else
				{
					System.out.println("NO record found");
				}
		    }
	        catch(Exception e)
		   {
	          System.out.println(e); 	
		   }


	}

}
