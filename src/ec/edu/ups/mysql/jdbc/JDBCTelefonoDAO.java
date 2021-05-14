package ec.edu.ups.mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.modelo.Telefono;

public class JDBCTelefonoDAO extends JDBCGenericDAO<Telefono, Integer> implements TelefonoDAO {

	@Override
	public void createTable() {
		conexion.update("DROP TABLE IF EXISTS Telefono");
		conexion.update("CREATE TABLE Telefono (" + "ID_TELEFONO INT NOT NULL, IDUSUARIO INT NOT NULL, " + "NUMERO VARCHAR(10), "
				+ "TIPO VARCHAR(255), OPERADORA VARCHAR(255)" + ", PRIMARY KEY (ID_TELEFONO),"
						+ " FOREIGN KEY (IDUSUARIO) REFERENCES USUARIO(ID_USUARIO))");
	}

	@Override
	public void create(Telefono telefono) {
		// TODO Auto-generated method stub
		conexion.update("INSERT Telefono VALUES (" + telefono.getId() + ", '" + telefono.getId_usuario() + "', '"
				+ telefono.getNumero() + "', '" + telefono.getTipo() + "','" + telefono.getOperadora() + "')");
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

	

}
