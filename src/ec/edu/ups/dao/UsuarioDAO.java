package ec.edu.ups.dao;

import ec.edu.ups.modelo.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, String> {
	
	public Usuario readCedula(String cedula);
	public Usuario readCorreo(String cedula);


}
