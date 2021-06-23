package Controladores;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.MysqlConnection;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

import Interfaces.ContratadoDAO;
import clases.Contratados;
import util.MySqlConexion;

public class MySqlContratadosDAO implements ContratadoDAO {

	@Override
	public int save(Contratados bean) {
		int salida=-1;
		Connection cn = null;
		PreparedStatement pstm=null;
		try {
			cn=MySqlConexion.getConexion();
			String sql= "insert into TB_CONTRATADOS values(null,?,?,?,?,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, bean.getDniContratado());
			pstm.setString(2, bean.getNombreContratado());
			pstm.setString(3, bean.getApellidoContratado());
			pstm.setString(4, bean.getDirecContratado());
			pstm.setString(5, bean.getEmailContratado());
			pstm.setInt(6, bean.getCelContratado());
			pstm.setDouble(7, bean.getSueldo());
			pstm.setInt(8, bean.getCodBanco());
			salida=pstm.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pstm!=null)pstm.close();
				if(cn!=null)pstm.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return salida;
	}

	@Override
	public int update(Contratados bean) {
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			cn=MySqlConexion.getConexion();
			String sql= "update TB_CONTRATADOS set dniContratado=?,nombreContratado=?,apellidoContratado=?,direcContratado=?, "+
			"emailContratado=?,celContratado=?, sueldo=?,codBanco=? where codContratado=?";
			pstm=cn.prepareStatement(sql);
			pstm.setString(1, bean.getDniContratado());
			pstm.setString(2, bean.getNombreContratado());
			pstm.setString(3, bean.getApellidoContratado());
			pstm.setString(4, bean.getDirecContratado());
			pstm.setString(5, bean.getEmailContratado());
			pstm.setInt(6, bean.getCelContratado());
			pstm.setDouble(7, bean.getSueldo());
			pstm.setInt(8, bean.getCodBanco());
			pstm.setInt(9, bean.getCodContratado());
			salida = pstm.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pstm!=null)pstm.close();
				if(cn!=null)pstm.close();
			} catch(SQLException e2) {
				e2.printStackTrace();
			}
		}
		return salida;
	}

	@Override
	public int delete(int cod) {
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			cn=MySqlConexion.getConexion();
			String sql="delete from TB_CONTRATADOS where codContratado=?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, cod);
			salida=pstm.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pstm!=null)pstm.close();
				if(cn!=null)cn.close();
			} catch(SQLException e2) {
				e2.printStackTrace();
			}
		}
		return salida;
	}

	@Override
	public List<Contratados> ListAll() {
		List<Contratados> lista =new ArrayList<Contratados>();
		Contratados bean =null;
		Connection cn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			cn=MySqlConexion.getConexion();
			String sql= "select c.*,concat(blan.CodBanco,'-',blan.nomBanco) from TB_CONTRATADOS c join  TB_BLANCOS blan on c.codBanco=blan.CodBanco order by 1";
			pstm=cn.prepareStatement(sql);
			rs=pstm.executeQuery();
			while(rs.next()) {
				bean = new Contratados();
				bean.setCodContratado(rs.getInt(1));
				bean.setDniContratado(rs.getString(2));
				bean.setNombreContratado(rs.getString(3));
				bean.setApellidoContratado(rs.getString(4));
				bean.setDirecContratado(rs.getString(5));
				bean.setEmailContratado(rs.getString(6));
				bean.setCelContratado(rs.getInt(7));
				bean.setSueldo(rs.getDouble(8));
				bean.setNomBanco(rs.getString(10));
				lista.add(bean);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)rs.close();
				if(pstm!=null)pstm.close();
				if(cn!=null)cn.close();
			} catch(SQLException e2) {
				e2.printStackTrace();
			}
		}
		return lista;
	}

	@Override
	public List<Contratados> ListAllBanco(int codBanco) {
		List<Contratados> lista=new ArrayList<>();
		Contratados bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MySqlConexion.getConexion();
			String sql="{call Consulta_Bancos(?)}";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1, codBanco);
			rs=cstm.executeQuery();
			while(rs.next()) {
				bean=new Contratados();
				bean.setCodContratado(rs.getInt(1));
				bean.setDniContratado(rs.getString(2));
				bean.setNombreContratado(rs.getString(3));
				bean.setApellidoContratado(rs.getString(4));
				bean.setNomBanco(rs.getString(5));
				lista.add(bean);
			}
		} catch(SQLException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(rs!=null)rs.close();
				if(cstm!=null)cstm.close();
				if(cn!=null)cn.close();
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
		}
		return lista;
	}

}
