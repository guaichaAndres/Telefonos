package ec.edu.ups.mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;

public class JDBCUsuarioDAO extends JDBCGenericDAO<Usuario, String> implements UsuarioDAO {

	@Override
	public void createTable() {
		conexion.update("DROP TABLE IF EXISTS Usuario");
		conexion.update("CREATE TABLE Usuario ( usu_cedula VARCHAR(255),"
				+ "usu_nombre VARCHAR(255), usu_apellido VARCHAR(255), usu_correo VARCHAR(255), "
				+ "usu_contrasena VARCHAR(255)" + ", PRIMARY KEY (usu_cedula))");
	}

	@Override
	public void create(Usuario u) {
		conexion.update("INSERT Usuario VALUES (" + u.getCedula() + ", '"
				+ u.getNombre() + "', '" + u.getApellido() + "','" + u.getCorreo() + "','" + u.getContrasena() + "' )");
	}

	@Override
	public Usuario read(String contrasena) {
		Usuario usuario = null;
		ResultSet rs = conexion.query("SELECT * FROM Usuario WHERE usu_contrasena="  + "'" +contrasena + "'");
		try {
			if (rs != null && rs.next()) {
				usuario = new Usuario(rs.getString("usu_cedula"), rs.getString("usu_nombre"),
						rs.getString("usu_apellido"), rs.getString("usu_correo"), rs.getString("usu_contrasena"));
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUsuarioDAO:read): " + e.getMessage());
		}
		return usuario;
	}

	/*@Override
	public void update(Usuario usuario) {
		conexion.update("UPDATE Usuario SET cedula = '" + usuario.getCedula() + "', nombre = '" + usuario.getNombre()
				+ "', apellido = '" + usuario.getApellido() + "' WHERE id = " + usuario.getId());

	}*/

	/*@Override
	public void delete(Usuario usuario) {
		conexion.update("DELETE FROM Usuario WHERE id = " + usuario.getId());

	}*/

	@Override
	public List<Usuario> find() {
		List<Usuario> list = new ArrayList<Usuario>();
		ResultSet rs = conexion.query("SELECT * FROM Usuario");
		try {
			while (rs.next()) {
				list.add(new Usuario(rs.getString("cedula"), rs.getString("nombre"),
						rs.getString("apellido"),  rs.getString("correo"), rs.getString("contrasena")));
			}

		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUsuarioDAO:find): " + e.getMessage());
		}
		return list;
	}


	@Override
	public void update(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario readCedula(String cedula) {
		Usuario usuario = null;
		ResultSet rs = conexion.query("SELECT * FROM Usuario WHERE usu_cedula="  + "'" +cedula + "'");
		try {
			if (rs != null && rs.next()) {
				usuario = new Usuario(rs.getString("usu_cedula"), rs.getString("usu_nombre"),
						rs.getString("usu_apellido"), rs.getString("usu_correo"), rs.getString("usu_contrasena"));
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUsuarioDAO:read): " + e.getMessage());
		}
		return usuario;
	}

	@Override
	public Usuario readCorreo(String correo) {
		Usuario usuario = null;
		ResultSet rs = conexion.query("SELECT * FROM Usuario WHERE usu_correo="  + "'" +correo + "'");
		try {
			if (rs != null && rs.next()) {
				usuario = new Usuario(
						rs.getString("usu_cedula"),
						rs.getString("usu_nombre"),
						rs.getString("usu_apellido"), 
						rs.getString("usu_correo"), 
						rs.getString("usu_contrasena"));
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUsuarioDAO:read): " + e.getMessage());
		}
		return usuario;
	}


}
