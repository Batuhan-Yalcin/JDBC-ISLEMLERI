package Deleteİslemleri;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Main {

	public static void main(String[] args) throws SQLException {
	
		DbHelper dbHelper = new DbHelper();
		PreparedStatement statement = null; 
		ResultSet resultSet;
		Connection connection = null;
		try {
			
			connection = dbHelper.getConnection();
			String sql = "delete from Calisma where id = ?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, 7);
			statement.executeUpdate();

			System.out.println("Kayıt Silindi..");
		}
		catch (SQLException e) {
			dbHelper.showErrorMessage(e);
		}
		finally {
			statement.close();
			connection.close();
		}

	}

}
