package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class JDBC_Delete {

	public static void main(String[] args) {
		try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			 Statement stm=con.createStatement();
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			 while(true)
			 {
				 System.out.println("Enter DEletion Employ ID");
				 int id=Integer.parseInt(br.readLine());
				 
				 int count =stm.executeUpdate("delete from emp1 where eno="+id);
				 if(count==1)
				 {
					 System.out.println("One record deleted");
				 }
				 else
				 {
					 System.out.println("NO Record deleted...");
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
