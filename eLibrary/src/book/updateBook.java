package book;
import java.util.*;



import java.sql.*;
public class updateBook {
	public static  void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		   
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
					PreparedStatement ps=con.prepareStatement("update  book set id=? where name=?");
				    while(true)
				    {
				    	System.out.println("Enter choice");
						System.out.println("1.EditId\n2.EditName\n3.EditAuthorName\n4.EditBookPrice\n5.EditBookQty\n6.Exit");
						int choice=Integer.parseInt(s.nextLine());
				    	switch(choice)
					    {
					    case 1:
					    	System.out.println("Enter New Id");
					    	String bId=s.nextLine();
					    	System.out.println("Enter book name");
					    	String bname=s.nextLine();
					    	ps.setString(1, bId);
					    	ps.setString(2, bname);
					    	int k=ps.executeUpdate();
					    	if(k>0)
					    	{
					    		System.out.println("update book id successfully...");
					    	}
					    	break;
					    case 2:
					    	break;
					    case 3:
					    	break;
					    case 4:
					    	break;
					    case 5:
					    	break;
					    case 6:
					    	System.out.println("Exited successfully...");
					    	System.exit(0);
					    	break;
					    default:
					    	System.out.println("invalid .....");
					    		
					    	
					    }
				    }
					
				}catch(Exception e) {e.printStackTrace();}
	}

}
