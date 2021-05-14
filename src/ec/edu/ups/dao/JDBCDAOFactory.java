package ec.edu.ups.dao;

import ec.edu.ups.mysql.jdbc.JDBCUsuarioDAO;

public class JDBCDAOFactory extends DAOFactory {

	@Override
	public void createTables() {
		this.getPersonaDAO().createTable();		

	}

	@Override
	public UsuarioDAO getPersonaDAO() {
		return new JDBCUsuarioDAO();
	}	

}
