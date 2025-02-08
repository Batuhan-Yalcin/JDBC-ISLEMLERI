package Updateİslemleri;

import java.sql.*;



public class Main {

	public static void main(String[] args) throws SQLException {
		DbHelper dbHelper = new DbHelper();
		PreparedStatement statement = null; 
		ResultSet resultSet;
		Connection connection = null;
		try {
			
			connection = dbHelper.getConnection();
			String sql = "UPDATE Calisma SET isim = ? WHERE id = ?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, "Aslan");  // 1. parametreden gelen yani isim =  Aslan olacak 
			statement.setInt(2, 3);  // 2. parametredekinin idsi = 3 olanın..
			statement.executeUpdate();

			System.out.println("Kayıt Güncellendi..");
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