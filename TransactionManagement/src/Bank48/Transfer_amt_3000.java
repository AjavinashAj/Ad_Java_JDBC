package Bank48;
import java.util.*;
import java.sql.*;
public class Transfer_amt_3000 {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			System.out.println("Commit status:"+con.getAutoCommit());
			con.setAutoCommit(false);
			System.out.println("Commit status:"+con.getAutoCommit());
			PreparedStatement ps1= con.prepareStatement("Select * from bank48 where accno=?");
			PreparedStatement ps2= con.prepareStatement
			("update bank48 set balance=balance+? where accno=?");
			Savepoint sp=con.setSavepoint();
			System.out.println("Enter homeAccno:");
			long hAccNo=s.nextLong();//6123456
			ps1.setLong(1,hAccNo);
			ResultSet rs1=ps1.executeQuery();
			if(rs1.next())
			{
				float bal=rs1.getFloat(3);
				System.out.println("Enter benefieceryAccNo:");
				long bAccNo=s.nextLong();
				ps1.setLong(1, bAccNo);
				ResultSet rs2=ps1.executeQuery();
				if(rs2.next())
				{
					System.out.println("Enter the amount to be transfered:");
					float amt=s.nextFloat();//3000
					if(amt<=bal)
					{
						ps2.setFloat(1,-amt);
						ps2.setLong(2, hAccNo);
						int i=ps2.executeUpdate();//updated..
						ps2.setFloat(1, amt);
						ps2.setFloat(2, bAccNo);
						int j=ps2.executeUpdate();//updated
						if(i==1 && j==1)
						{
							con.commit();//updated Database
							System.out.println("transaction  Successfull...");
						}
						else
						{
							con.rollback(sp);
							System.out.println("Transaction failed...");
						}
					}
					else
					{
						System.out.println("Insufficent fund...");
					}
				}
				else
				{
					System.out.println("Invalid bAccNo...");
				}
			}
			else
			{
				System.out.println("Invalid homeAccNo....");
			}
			
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
