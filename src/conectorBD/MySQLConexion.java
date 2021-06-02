package conectorBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConexion {
	public static Connection getConexion() {
		
		Connection cn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url,user,pass;
			url="jdbc:mysql://localhost/db_proyectolp1?serverTimezone=UTC";
			user="root";
			pass="mysql";
			cn=DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			System.out.println("Error conectar driver");
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			System.out.println("error al conectar con la bd");
			e.printStackTrace();
		}
		
		return cn;

	}
}
