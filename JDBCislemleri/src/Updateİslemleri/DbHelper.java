package Updateİslemleri;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
	
	
	private String userName = "root";
	private String password = "b190758x";
	private String dbUrl = "jdbc:mysql://localhost:3306/javacalisma";
	
	public Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(dbUrl,userName,password);
	}
	
	public void showErrorMessage(SQLException exception) {
		System.out.println("ERROR : " + exception.getMessage());
		System.out.println("ERROR CODE : " + exception.getErrorCode());
	}


}