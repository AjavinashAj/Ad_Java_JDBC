package test;

import java.util.*;
import java.sql.*;   
public class DBCon4 {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##avi","avinash");
			PreparedStatement ps1 =con.prepareStatement("insert into Employee48 values(?,?,?,?,?)");//compilation process
			PreparedStatement ps2=con.prepareStatement("select* from Employee48");//compillation process
			while(true) {
				System.out.println("============choice=========");
				System.out.println("1.AddEmployee\n2.ViewEmployees\n3.exit");
				System.out.println("enter the choice");
				switch(Integer.parseInt(s.nextLine())) {
				case 1:
					System.out.println("enter the empId:");
					String id =s.nextLine();
					System.out.println("enter the empName");
					String name =s.nextLine();
					System.out.println("enter empDesgn");
					String desgn = s.nextLine();
					System.out.println("enter empBsal");
					int bsal =Integer.parseInt(s.nextLine());
					float totSal =bsal+(0.93F*bsal)+(0.63F*bsal);
					
					ps1.setString(1, id);
					ps1.setString(2, name);
					ps1.setString(3, desgn);
					ps1.setInt(4, bsal);
					ps1.setFloat(5, totSal);
					
					int k=ps1.executeUpdate();//Execution process
					if(k>0) {
						System.out.println("Employee Added Sucessfully");
					}
					break;
					
				case 2:
					
					ResultSet rs =ps2.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getString(1)+"\t"+rs.getString(2)+
								"\t"+rs.getString(3)+"\t"+rs.getInt(4)+
								"\t"+rs.getFloat(5));
						
					}//end of loop
					break;
	   					
				case 3:
					System.out.println("Operation Stoped......");
					System.exit(0);
					
					default:
					System.out.println("Invalid Choice......");
					
				}//end of switch
			}//end of while
			
					
		}catch(Exception e) {e.printStackTrace();}

	}

}
