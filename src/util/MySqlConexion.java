package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlConexion {

	public static Connection getConexion() {
		Connection cn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url,user,pass;
			url="jdbc:mysql://localhost/modelo_cl2_lp1_2021_01?serverTimezone=UTC";
			user="root";
			pass="mysql";
			cn=DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return cn;
	}
}
	