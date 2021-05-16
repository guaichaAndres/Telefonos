package ec.edu.ups.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;

public interface TelefonoDAO extends GenericDAO<Telefono, Integer> {

	public List<Telefono> listarCedula(String cedula);
	
}
