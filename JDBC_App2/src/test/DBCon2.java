package test;
import java.util.*;
import java.sql.*;
public class DBCon2 {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the ProductCode");
			String code =s.nextLine();
			System.out.println("enter the Product name");
			String name =s.nextLine();
			System.out.println("enter the product price");
		    float price=Float.parseFloat(s.nextLine());
		    System.out.println("enter product quantity");
		    int qty =Integer.parseInt(s.nextLine());
		    
		    Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##avi","avinash");
		    Statement stm =con.createStatement();
		    int k=stm.executeUpdate("insert into product48 values('"+code+"','"+name+"',"
		    		+price+","+qty+")");
		    
		    if(k>0) {
		    	System.out.println("Product details inserted Sucessfully");
		    }
		    con.close();
		    s.close();
		    				
		    				
		    
			
		}catch(Exception e) {e.printStackTrace();}
		

	}

}
