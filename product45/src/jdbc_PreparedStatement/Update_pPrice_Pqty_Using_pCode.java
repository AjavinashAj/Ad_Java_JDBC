package jdbc_PreparedStatement;
import java.util.*;
import java.sql.*;
public class Update_pPrice_Pqty_Using_pCode {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter pCode");
			String pCode=s.nextLine();
			Connection con=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
			PreparedStatement ps1=con.prepareStatement
			("select * from product45 where pid=?");
			PreparedStatement ps2=con.prepareStatement
			("update product45 set pprice=?,pno=pno+? where pid=?");
			
			ps1.setString(1, pCode);
			ResultSet rs=ps1.executeQuery();
			if(rs.next())
			{
				System.out.println("Old pPrice:"+rs.getFloat(3));
				System.out.println("Enter new pPrice");
				float newPrice=s.nextFloat();
				System.out.println("Available qty:"+rs.getString(4));
				System.out.println("Enter new pQty");
				int newQty=s.nextInt();
				ps2.setFloat(1, newPrice);
				ps2.setInt(2, newQty);
				ps2.setString(3, pCode);
				int k=ps2.executeUpdate();
				if(k>0)
				{
					System.out.println("Product updated successfully....");
				}
				else
				{
					System.out.println("Invalid Product code....");
				}
				s.close();
				
			}
			con.close();
		}
		catch(Exception e) {e.printStackTrace();}
		
	}

}
