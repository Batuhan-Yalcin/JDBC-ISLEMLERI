package PaketDahilEtme;

import java.sql.*;
import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) 
	{
		
		
	}
	
	
	public static void jdbcIslemleri() throws SQLException
	{
		DbHelper dbHelper = new DbHelper();
		Statement statement = null;
		ResultSet resultSet; // Sonuçları Getirir ResultSet
		Connection connection = null;
		try {
			
			connection = dbHelper.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select id,isim,soyisim from Calisma");
			ArrayList<CalismaTablo> calisma = new ArrayList<CalismaTablo>();
			while(resultSet.next())
			{
			calisma.add(new CalismaTablo(
			resultSet.getInt("id"),
			resultSet.getString("isim"),
			resultSet.getString("soyisim")));
			}
			System.out.println(calisma.size());
		}
		catch (SQLException e) {
			dbHelper.showErrorMessage(e);
		}
		finally {
			connection.close();
		}

	}
}
