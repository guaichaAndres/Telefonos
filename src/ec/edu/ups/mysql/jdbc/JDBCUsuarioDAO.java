package ec.edu.ups.mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;

public class JDBCUsuarioDAO extends JDBCGenericDAO<Usuario, Integer> implements UsuarioDAO {

	@Override
	public void createTable() {
		conexion.update("DROP TABLE IF EXISTS Usuario");
		conexion.update("CREATE TABLE Usuario (" + "ID INT NOT NULL, " + "CEDULA VARCHAR(10), "
				+ "NOMBRE VARCHAR(255), APELLIDO VARCHAR(255), CORREO VARCHAR(255), CONTRASENA VARCHAR(255)" + ", PRIMARY KEY (ID))");
	}

	@Override
	public void create(Usuario u) {
		conexion.update("INSERT Usuario VALUES (" + u.getId() + ", '" + u.getCedula() + "', '"
				+ u.getNombre() + "', '" + u.getApellido() + "','" + u.getCorreo() + "','" + u.getContrasena() + "' )");
	}

	@Override
	public Usuario read(Integer id) {
		Usuario usuario = null;
		ResultSet rs = conexion.query("SELECT * FROM Usuario WHERE id=" + id);
		try {
			if (rs != null && rs.next()) {
				usuario = new Usuario(rs.getInt("id"), rs.getString("cedula"), rs.getString("nombre"),
						rs.getString("apellido"), rs.getString("correo"), rs.getString("contrasena"));
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUsuarioDAO:read): " + e.getMessage());
		}

		return usuario;
	}

	@Override
	public void update(Usuario usuario) {
		conexion.update("UPDATE Usuario SET cedula = '" + usuario.getCedula() + "', nombre = '" + usuario.getNombre()
				+ "', apellido = '" + usuario.getApellido() + "' WHERE id = " + usuario.getId());

	}

	@Override
	public void delete(Usuario usuario) {
		conexion.update("DELETE FROM Usuario WHERE id = " + usuario.getId());

	}

	@Override
	public List<Usuario> find() {
		List<Usuario> list = new ArrayList<Usuario>();
		ResultSet rs = conexion.query("SELECT * FROM Usuario");
		try {
			while (rs.next()) {
				list.add(new Usuario(rs.getInt("id"), rs.getString("cedula"), rs.getString("nombre"),
						rs.getString("apellido"),  rs.getString("correo"), rs.getString("contrasena")));
			}

		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUsuarioDAO:find): " + e.getMessage());
		}
		return list;
	}

}
