package mantenimiento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import clases.Usuario;
import util.MySqlConexion;

public class GestionUsuario {
 
	public Usuario obtenerUsuario(Usuario usu) {
		
		Usuario usuario = null;
		Connection con = null;
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			con = MySqlConexion.getConexion();
			
			String sql = "SELECT * FROM db_proyectolp1.usuario where usuario = ? and clave = ?";
			pst = con.prepareStatement(sql);
			
			pst.setString(1,usu.getUsuario());
			pst.setString(2, usu.getClave());
			
			rs = pst.executeQuery();
			
			while(rs.next()) {
				usuario = new Usuario(rs.getString(1), rs.getString(2));
			}
			
		} catch (Exception e) {
		System.out.println("Eror en obtener usuario ");
		}
		
		return usuario;
		
		
	}
}
