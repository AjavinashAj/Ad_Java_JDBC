package jdbc_Statement;
import java.sql.*;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CreateTable {

	public static void main(String[] args) {

              try {
            	 // Class.forName("oracle.jdbc.driver.OracleDriver");
            	  Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avinash");
            	  Statement stm=(Statement) con.createStatement();
            	  ((java.sql.Statement) stm).executeQuery("create table StudentDetails45 (sid varchar2(5),sname varchar2(15),school varchar2(15),saddr varchar2(10),sper number(3))");
            	  System.out.println("Table created successfully....");
              }
              catch(Exception e) {e.printStackTrace();}

	}

}
