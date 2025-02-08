package Insertİslemleri;

import java.sql.*;

public class Main {

	public static void main(String[] args) throws SQLException {
		DbHelper dbHelper = new DbHelper();
		PreparedStatement statement = null; // insert işlemi için PreparedStatement kullanırız.
		ResultSet resultSet; // Sonuçları Getirir ResultSet
		Connection connection = null;
		try {
			
			connection = dbHelper.getConnection();
		String sql = "INSERT INTO Calisma(id,isim,soyisim) values (?,?,?)"; // ? işareti kullanıcının girmesi için
		statement = connection.prepareStatement(sql);
		statement.setInt(1, 7); // id ? işaretinde 1. sırada olduğu için 1. sütuna 7 değeri eklensin dedik..
		statement.setString(2, "Tarık"); // isim ? işaretinde 2. sırada Tarık eklensin dedik.
		statement.setString(3, "Aktay"); // soyisim ? işaretinde 2. sırada Aktay eklensin dedik.
		statement.executeUpdate(); // Kayıt Eklemek için executeUpdate Yapmamız lazım.
			System.out.println("Kayıt Eklendi..");
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
