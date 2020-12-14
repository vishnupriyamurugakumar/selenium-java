package javaConceptsForSelenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	public static void main (String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/test_table");
		
		
		Statement statement  = connection.createStatement();
		
		ResultSet resultSet =  statement.executeQuery("SELECT * FROM `tbl_test_login`");
		
		while (resultSet.next()) {
			System.out.println("Name : " + resultSet.getString(1) + "\n" + "SurName : " + resultSet.getString(2) );
			System.out.println("\n");
		}
	}

}
