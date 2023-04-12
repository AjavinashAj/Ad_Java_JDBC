package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewAllbook {
	public static void main(String[]args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
		PreparedStatement ps=con.prepareStatement("select * from book");
		ResultSet rs=ps.executeQuery();
		Book ob=new Book();
		while(rs.next())
		{
			ob.setbId(rs.getString(1));
			ob.setBname(rs.getString(2));
			ob.setBauthor(rs.getString(3));
			ob.setBprice(rs.getDouble(4));
			ob.setQty(rs.getInt(5));
			
		}
		System.out.println(ob.toString());
		
		con.close();
	}
	catch(Exception e) {e.printStackTrace();};

}
}