package jdbc_PreparedStatement;
import java.util.*;
import java.sql.*;
public class Login {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			Connection con =DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			PreparedStatement ps1=con.prepareStatement
		    ("insert into UserReg45 values(?,?,?,?,?,?,?)");
			PreparedStatement ps2=con.prepareStatement
			("select * from UserReg45 where uname=? and Pword=?");
			while(true)
			{
			System.out.println("======= choice =========");
			System.out.println("1.Registration\n2.Login\n3.Exit");
			System.out.println("Enter the choice");
			int choice=Integer.parseInt(s.nextLine());
			switch(choice)
			{
				case 1:
					System.out.println("Enter User name:");
					String uName=s.nextLine();
					System.out.println("Enter UserPassword:");
					String pWord=s.nextLine();
					System.out.println("Enter User FirstName:");
					String fName=s.nextLine();
					System.out.println("Enter User LastName:");
					String lName=s.nextLine();
					System.out.println("Enter User Address:");
					String addr=s.nextLine();
					System.out.println("Enter GmailId:");
					String mId=s.nextLine();
					System.out.println("Enter MobileNo:");
					long mNo=Long.parseLong(s.nextLine());
					
					ps1.setString(1,uName);
					ps1.setString(2,pWord);
					ps1.setString(3,fName);
					ps1.setString(4,lName);
					ps1.setString(5,addr);
					ps1.setString(6,mId);
					ps1.setLong(7,mNo);
					
					int k=ps1.executeUpdate();
					if(k>0)
					{
						System.out.println("User Register Successfully....");
					}
					break;
				case 2:
					System.out.println("Enter User name:");
					String uN=s.nextLine();
					System.out.println("Enter UserPassword:");
					String pW=s.nextLine();
					
					ps2.setString(1, uN);
					ps2.setString(2,pW);
					
					ResultSet rs=ps2.executeQuery();
					if(rs.next())
					{
					   System.out.println("Login SuccessFully....");
					   System.out.println("Welcome Uname:"+rs.getString(3));
					}
					else
					{
						System.out.println("Invalid login....");
					}
					
					break;
				case 3:System.out.println("Program terminated...");
				    System.exit(0);
					break;
				default:System.out.println("Invalid choice");
			}
			
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
