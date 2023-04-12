package test;
import java.util.*;
import java.sql.*;
public class DBCon7 {

	public static void main(String[] args) {
		try {
			
			Scanner s =new Scanner(System.in);
			System.out.println("Enter the Empid");
			String id =s.nextLine();
			Connection con =DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","c##avi","avinash");
			CallableStatement cs =con.prepareCall
					("{call EmpRetrieve48(?,?,?,?,?,?,?,?,?,?,?)");
			cs.setString(1,id);
			cs.registerOutParameter(2,Types.VARCHAR);
			cs.registerOutParameter(3, Types.VARCHAR);
			cs.registerOutParameter(4, Types.VARCHAR);
			cs.registerOutParameter(5,Types.VARCHAR);
			cs.registerOutParameter(6, Types.VARCHAR);
			cs.registerOutParameter(7,Types.INTEGER);
			cs.registerOutParameter(8,Types.VARCHAR);
			cs.registerOutParameter(9,Types.BIGINT);
			cs.registerOutParameter(10,Types.INTEGER);
			cs.registerOutParameter(11,Types.FLOAT);
			cs.execute();//Procedure executed
			System.out.println("id:"+id);
			System.out.println("name:"+cs.getString(2));
			System.out.println("Desg:"+cs.getString(3));
			System.out.println("HNO"+cs.getString(4));
			System.out.println("SNAME"+cs.getString(5));
			System.out.println("CITY"+cs.getString(6));
			System.out.println("PinCOde"+cs.getInt(7));
			System.out.println("MailId"+cs.getString(8));
			System.out.println("phno"+cs.getString(9));
			System.out.println("Bsal"+cs.getInt(10));
			System.out.println("TOTSAL"+cs.getFloat(11));
			s.close();
			
		}catch (Exception e) {e.printStackTrace();}

	}

}
