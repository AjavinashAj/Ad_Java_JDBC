package jdbc_Statement;
import java.text.SimpleDateFormat;
import java.util.*;
public class Date {
	

	
	  public static void main(String[] args) throws Exception {
	    System.out.println("dd-mm-yyyy");
	    Scanner scanner = new Scanner(System.in);
	    String date = scanner.nextLine();
	    java.util.Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(date);  
	    System.out.println(date1);
	  }
	}


