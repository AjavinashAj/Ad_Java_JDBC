package test;
import java.sql.*;
import java.util.*;

public class DBCon5 {

	
	public static void main(String[] args) {
		try {
			Scanner s =new Scanner(System.in);
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##avi","avinash");
			PreparedStatement ps1 =con.prepareStatement("select * from Employee48 where id=?");
			PreparedStatement ps2 =con.prepareStatement("update Employee48 set bsal=?,totsal=?,where id=?");
			PreparedStatement ps3 =con.prepareStatement("delete from Employee48 where id=?");
			System.out.println("Enter the empId");
			String id=s.nextLine();
			ps1.setString(1,id);
			ResultSet rs=ps1.executeQuery();
			if(rs.next()) {
				while(true) {
				System.out.println("==========choice========");
				System.out.println("1.veiwDetails\n2. UpdateDetails\n3. DeleteDetails\n4.exit");
				System.out.println("Enter the choice");
				switch(Integer.parseInt(s.nextLine())) {
				case 1:
					
					System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+
							"\t"+rs.getInt(4)+"\t"+rs.getFloat(5));
					
					break;
					
				case 2:
					
					System.out.println("old bsal:"+rs.getInt(4));
					System.out.println("Enter new bsal:");
					int newBsal =Integer.parseInt(s.nextLine());
					float newTotSal=
							(0.93F*newBsal)+(0.63F*newBsal);
					ps2.setInt(1, newBsal);
					ps2.setFloat(2,newTotSal);
					ps2.setString(3, id);
					int k =ps2.executeUpdate();
					if(k>0){
						System.out.println("Details updated Sucessfully...");
					}
					
					break;
					
					
				case 3:
					
					ps3.setString(1, id);
					int z=ps3.executeUpdate();
					if(z>0) {
						System.out.println("Details delete Sucessfully....");
					
					}
					break;
				case 4:
					
					System.out.println("operationstoped.....");
					System.exit(0);
					
					default:
					{
						System.out.println("Invalid choice........");
				    }
				
			} 
		}
			}
	} catch(Exception e) {e.printStackTrace();}
		

}
}
