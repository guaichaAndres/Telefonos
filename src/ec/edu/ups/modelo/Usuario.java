package ec.edu.ups.modelo;

import java.io.Serializable;

public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String cedula;
	private String nombre;
	private String apellido;
	private String correo;
	private String contrasena;


	public Usuario() {
		// Constructor obligatorio
	} 

	public Usuario(int id, String cedula, String nombre, String apellido,String correo, String contrasena) { 
		// Constructor opcional
		this.setId(id);
		this.setCedula(cedula);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setCorreo(correo);
		this.setContrasena(contrasena);	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getCedula() {
		return cedula;
	}
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}

