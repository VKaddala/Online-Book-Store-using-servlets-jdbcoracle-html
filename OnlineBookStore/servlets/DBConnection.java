package servlets;
import java.sql.*;
import java.util.ResourceBundle;



public class DBConnection {
	private static Connection con;
	
	private DBConnection(){};
	
	static {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try {
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","avkumar1234");
		
		}
		catch (SQLException e) {

			e.printStackTrace();
		
		}
		
		
	}//End of static block
	
	public static Connection getCon()
	{
		return con;
	}
}
