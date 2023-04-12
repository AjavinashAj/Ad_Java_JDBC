package test;

import java.sql.*;
import java.util.*;

public class DBCon6 {

	public static void main(String[] args) {
	try {
          Scanner s =new Scanner(System.in);
          System.out.println("Enter the EmpId:");
          String id=s.nextLine();
          System.out.println("Enter the EmpName:");
          String name =s.nextLine();
          System.out.println("Enter the EmpDesgn");
          String desg =s.nextLine();
          System.out.println("Enter the EmpHno:");
          String hno=s.nextLine();
          System.out.println("Enter the EmpSname:");
          String sname =s.nextLine();
          System.out.println("Enter the EmpCity");
          String city=s.nextLine();
          System.out.println("Enter the EmpPincode:");
          int pincode = Integer.parseInt(s.nextLine());
          System.out.println("Enter the EmpMail:");
          String mid =s.nextLine();
          System.out.println("Enter the EmpPHNO");
          long phno =Long.parseLong(s.nextLine());
          System.out.println("Enter the EmpBsal");
          float bsal =Float.parseFloat(s.nextLine());
          float totsal =bsal+(0.93F*bsal)+(0.63F*bsal);
          Connection con =DriverManager.getConnection
        		  ("jdbc:oracle:thin:@localhost:1521:orcl","c##avi","avinash");
          CallableStatement cs =con.prepareCall("{call EmpDetails48(?,?,?,?,?,?,?,?,?,?,?)}");
          cs.setString(1,id);
          cs.setString(2,name);
          cs.setString(3,desg);
          cs.setString(4,hno);
          cs.setString(5, sname);
          cs.setString(6, city);
          cs.setInt(7,pincode);
          cs.setString(8, mid);
          cs.setLong(9, phno);
          cs.setFloat(10, bsal);
          cs.setFloat(11, totsal);
          cs.execute();//procedure executed
          System.out.println("Emp details updated successfully....");
          con.close();
          s.close();
          
	}catch (Exception e) {e.printStackTrace();}
	}
}
