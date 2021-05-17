package ec.edu.ups.mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;

public class JDBCTelefonoDAO extends JDBCGenericDAO<Telefono, Integer> implements TelefonoDAO {

	@Override
	public void createTable() {
		conexion.update("DROP TABLE IF EXISTS Telefono");
		conexion.update("CREATE TABLE Telefono (tel_codigo INT NOT NULL auto_increment, usu_cedula varchar(255),"
				+ "tel_numero VARCHAR(10), "
				+ "tel_tipo VARCHAR(255),tel_operadora VARCHAR(255)" + ", PRIMARY KEY (tel_codigo),"
						+ " FOREIGN KEY (usu_cedula) REFERENCES USUARIO(usu_cedula))");
	}

	@Override
	public void create(Telefono telefono) {
		Usuario u = new Usuario();
		// TODO Auto-generated method stub
		conexion.update("INSERT into Telefono (tel_numero,usu_cedula,tel_tipo,tel_operadora) VALUES ("+ telefono.getNumero()
		+ ",'"+ telefono.getUsuarioTelefono().getCedula() + "','" + telefono.getTipo() + "','" + telefono.getOperadora() + "')");
	}
	

	@Override
	public  Telefono read(Integer numero) {
		Telefono telefono = null;
		ResultSet rs = conexion.query("SELECT * FROM Telefono WHERE tel_numero="  + "'" +numero + "'");
		try {
			if (rs != null && rs.next()) {
				telefono = new Telefono(rs.getInt("tel_codigo"), rs.getInt("tel_numero"),
						rs.getString("tel_tipo"), rs.getString("tel_operadora"));
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCTelefonoDAO:read): " + e.getMessage());
		}
		return telefono;
	}

	@Override
	public void update(Telefono telefono) {
		conexion.update("UPDATE Telefono SET tel_numero = '" + telefono.getNumero() + "', tel_tipo = '" + telefono.getTipo()
		+ "', tel_operadora = '" + telefono.getOperadora() + "' WHERE usu_cedula = " + telefono.getUsuarioTelefono().getCedula());
	}

	@Override
	public void delete(Telefono entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Telefono> find() {
		List<Telefono> list = new ArrayList<Telefono>();
		ResultSet rs = conexion.query("SELECT * FROM Telefono");
		try {
			while (rs.next()) {
				list.add(new Telefono(rs.getInt("tel_codigo"), rs.getInt("tel_numero"),
						rs.getString("tel_tipo"),  rs.getString("tel_operadora")));
			}

		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCTelefonoDAO:find): " + e.getMessage());
		}
		return list;
		
	}

	@Override
	public Telefono read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Telefono> listarCedula(String cedula) {
		List<Telefono> list = new ArrayList<Telefono>();
	
		ResultSet rs = conexion.query("SELECT * FROM Telefono WHERE usu_cedula="+ "'" +cedula + "'");
		try {
			while (rs.next()) {
				list.add(new Telefono(rs.getInt("tel_codigo"), rs.getInt("tel_numero"),
						rs.getString("tel_tipo"),  rs.getString("tel_operadora")));
			}

		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCTelefonoDAO:find): " + e.getMessage());
		}
		return list;
	}

	

}
