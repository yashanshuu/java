package utils;
import java.sql.*;

public class DBUtils {
//add a static method to return DB connection.
	public static Connection openConnection() throws ClassNotFoundException,
	SQLException{
		//1. OPTIONAL : load the JDBC driver
	//	Class.forName("com.mysql.cj.jdbc.Driver");
		//2 : MANDATORY
		String url = "jdbc:mysql://localhost:3306/dbda_sep23?useSSL=false&allowPublicKeyRetrieval=true";
		return DriverManager.getConnection(url, "root", "wonder56 ");
	}
	
}
