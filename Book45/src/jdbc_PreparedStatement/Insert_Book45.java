package jdbc_PreparedStatement;
import java.util.*;
import java.sql.*;
public class Insert_Book45 {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			
			Connection con =DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			PreparedStatement ps=con.prepareStatement
			("insert into book45 values(?,?,?,?,?)");
			PreparedStatement ps2=con.prepareStatement
			("select * from Book45");
			PreparedStatement ps3=con.prepareStatement
					("select * from Book45 where bcod=?");
			
			while(true)
			{
				System.out.println("=========choice=========");
				System.out.println("Enter choice...\n1.AddBook\n2.viewAllBooks\n3.ViewBook By bookcode\n4.Update\n5.Delete\n6.Exit");
				int choice=Integer.parseInt(s.nextLine());
				
				switch(choice)
				{
				case 1:
					System.out.println("Enter Book code");
					String bcode=s.nextLine();
					System.out.println("Enter Book name");
					String bname=s.nextLine();
					System.out.println("Enter book author name");
					String bauthor=s.nextLine();
					System.out.println("Enter book Price");
					float bprice=Float.parseFloat(s.nextLine());
					System.out.println("Enter book Quantity");
					int bqty=Integer.parseInt(s.nextLine());
					
			        ps.setString(1, bcode);
			        ps.setString(2, bname);
			        ps.setString(3, bauthor);
			        ps.setFloat(4, bprice);
			       ps.setInt(5, bqty);
			       
			       int k=ps.executeUpdate();
			       if(k>0)
			       {
			    	   System.out.println("One book added successfully......");
			       }
			       else
			       {
			    	   System.out.println("no book Added......");
			       }
			       break;
				case 2:
					ResultSet rs=ps2.executeQuery();
					while(rs.next())
					{
						System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4)+"\t"+rs.getInt(5));
					}
					break;
				case 3:
					System.out.println("Enter Book code:");
					String bcode1=s.nextLine();
					ps3.setString(1, bcode1);
					ResultSet rs1=ps3.executeQuery();
					while(rs1.next())
					{
						System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getFloat(4)+"\t"+rs1.getInt(5));
					}
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					System.out.println("program is terminated.....");
					System.exit(0);
					break;
				default:System.out.println("Envalid information.....");
				}
			
			}
			
			
		}
		catch(Exception e) {e.printStackTrace();}
		

	}

}
