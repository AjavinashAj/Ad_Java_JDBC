package test;
import java.sql.*;
import java.util.*;
public class LoginPage {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			PreparedStatement ps=con.prepareStatement("insert into userreg48 values(?,?,?,?,?,?,?)");
			PreparedStatement ps1=con.prepareStatement("select * from userreg48 where uname=? and pword=?");
			PreparedStatement ps2=con.prepareStatement("select * from userreg48 where uname=?");
			while(true)
			{
				System.out.println("1.Registration\n2.Login\n3.Exit");
				int choice=Integer.parseInt(s.nextLine());
				switch(choice)
				{
				case 1:
					System.out.println("Enter User name");
					String un=s.nextLine();
					System.out.println("Enter password");
					String pw=s.nextLine();
					System.out.println("Enter first name");
					String fname=s.nextLine();
					System.out.println("Enter Last name");
					String lname=s.nextLine();
					System.out.println("Enter city");
					String city=s.nextLine();
					System.out.println("Enter mail ");
					String mid=s.nextLine();
					System.out.println("Enter phone number");
					Long phno=Long.parseLong(s.nextLine());
					ps.setString(1, un);
					ps.setString(2, pw);
					ps.setString(3, fname);
					ps.setString(4,lname);
					ps.setString(5, city);
					ps.setString(6, mid);
					ps.setLong(7, phno);
					
					int k=ps.executeUpdate();
					if(k>0)
					{
						System.out.println("Register successfully...");
					}
					 break;
				case 2:
					  System.out.println("Enter user name");
					  String name=s.nextLine();
					  System.out.println("Enter password");
					  String pwo=s.nextLine();
					  ps1.setString(1, name);
					  ps1.setString(2, pwo);
					  ResultSet rs=ps1.executeQuery();
					  if(rs.next())
					  {
						  System.out.println("Login SuccessFully....");
						   System.out.println("Welcome :"+rs.getString(3));
						  while(true)
						  {
							  System.out.println("1.viewDetails\n2.UpdateDetails\n3.Exit");
							  int n=Integer.parseInt(s.nextLine());
							  switch(n)
							  {
							  case 1:
								  ps2.setString(1, name);
								  ResultSet rs1=ps2.executeQuery();
								  while(rs1.next())
								  {
									  System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getString(4)+"\t"+rs1.getString(5)+"\t"+rs1.getString(6)+"\t"+rs1.getLong(7));
								  }
								  break;
							  case 2:
								   break;
							  case 3:
								    System.out.println("Exit successfully...");
								    System.exit(0);
								    break;
							default: 
								System.out.println("invalid.....");
								  
							  }
						  }
					  }
					  else
					  {
						  System.out.println("invalid data....");
					  }
					 break;
				case 3:
					System.out.println("Exit Successfully.....");
					System.exit(0);
					 break;
					 
				default:
					System.out.println("invalid....");
				}
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
