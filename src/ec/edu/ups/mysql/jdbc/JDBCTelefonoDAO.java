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
		System.out.println(u.getCedula());
		// TODO Auto-generated method stub
		conexion.update("INSERT into Telefono (tel_numero,tel_tipo,tel_operadora) VALUES ("+ telefono.getNumero()
		+ ",'" + telefono.getTipo() + "','" + telefono.getOperadora() + "')");
	}
	

	@Override
	public Telefono read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Telefono entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Telefono entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Telefono> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Telefono read() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
