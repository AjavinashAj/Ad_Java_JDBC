package test;
import java.util.*;
import java.sql.*;
public class DBCon8 {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the emp-id:");
			String id =s.nextLine();
			Connection con =DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","c##avi","avinash");
			CallableStatement cs =con.prepareCall("{call?:=RetrieveTotsal48(?)}");
			cs.setString(2, id);
			cs.registerOutParameter(1, Types.FLOAT);
			cs.execute();
			System.out.println("TotSal:"+cs.getFloat(1));
			con.close();
			s.close();
		}catch (Exception e) {e.printStackTrace();}

	}

}
