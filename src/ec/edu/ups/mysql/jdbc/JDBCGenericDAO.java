package ec.edu.ups.mysql.jdbc;

import ec.edu.ups.dao.GenericDAO;

public abstract class JDBCGenericDAO<T, V> implements GenericDAO<T, V> {
	protected ContextJDBC conexion = ContextJDBC.getJDBC1();

}
