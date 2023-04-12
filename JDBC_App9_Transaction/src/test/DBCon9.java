package test;
import java.util.*;
import java.sql.*;
public class DBCon9 {

	public static void main(String[] args) {
		try {
			Scanner s= new Scanner(System.in);
			Connection con=DriverManager.getConnection
					(" jdbc:oracle:thin:@localhost:1521:orcl","c##avi","avinash");
			System.out.println("Commit Status:"+con.getAutoCommit());
			con.setAutoCommit(false);
			System.out.println("commit status:"+con.getAutoCommit());
			PreparedStatement ps1 =con.prepareStatement
					("select * from Bank48 where accno=?");
			PreparedStatement ps2 =con.prepareStatement
					("update bank48 set balance=balance+? where accno=?");
			Savepoint sp =con.setSavepoint();
			System.out.println(("Enter homeAccno:"));
			long hAccNo =s.nextLong();//6123456
			ps1.setLong(1, hAccNo);
			ResultSet rs1 =ps1.executeQuery();
			if(rs1.next())
			{
				float bal =rs1.getFloat(3);//12000
				System.out.println("Enter beneficieryAccNo:");
				long bAccNo =s.nextLong();//313131
				ps1.setLong(1,bAccNo);
				ResultSet rs2 =ps1.executeQuery();
				if(rs2.next())
				{
				System.out.println("Enter the amount to be transferred:");
				float amt =s.nextFloat();//3000
				if(amt<=bal)
				{
					ps2.setFloat(1, -amt);
					ps2.setLong(2, hAccNo);
					int i=ps2.executeUpdate();//updated in buffer
					ps2.setFloat(1,amt);
					ps2.setLong(2, bAccNo);
					int j=ps2.executeUpdate();//update in buffer
					if(i==1 && j==1)
					{
						con.commit();//update Database
						System.out.println("Transaction Successfully......");
						
					}
					else 
				    {
						con.rollback(sp);
						System.out.println("Transaction failed....");
					}
				/*	else 
					{
						System.out.println("Insufficent Funds");
						
					}
					else 
					{
						System.out.println("Invalid bAccNo...");
					}
					else 
					{
						System.out.println("Invalid homeAccNo");
					}
					
				}
				}
			}
		}*/
		catch(Exception e) {e.printStackTrace();}
			
		

	}

				}
			
