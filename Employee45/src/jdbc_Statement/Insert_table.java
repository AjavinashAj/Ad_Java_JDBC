package jdbc_Statement;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
public class Insert_table {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter emp id");
			String eid=s.nextLine();
			System.out.println("Enter emp name");
			String ename=s.nextLine();
			System.out.println("Enter emp designation");
			String edesig=s.nextLine();
			System.out.println("Enter emp salary");
			float esal=Float.parseFloat(s.nextLine());
			//System.out.println("Enter emp date of joining in DD-MM-YYYY");
			//String edoj=s.nextLine();
			//java.util.Date edoj1=new SimpleDateFormat("dd-MM-yyyy").parse(edoj);
			Connection con =DriverManager.getConnection
		   ("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			Statement stm=con.createStatement();
			int k=stm.executeUpdate("insert into employee45 values('"+eid+"','"+ename+"','"+edesig+"',"+esal+")");
			if(k>0)
			{
				System.out.println("Inserted successfully....");
			}
			else
			{
				System.out.println("invalid  .....");
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
