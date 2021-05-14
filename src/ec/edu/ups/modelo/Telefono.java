package ec.edu.ups.modelo;

import java.io.Serializable;

public class Telefono implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private int id_usuario;


	private String numero;
	private String tipo;
	private String operadora;

	public Telefono() {
		// Constructor obligatorio
	} 

	public Telefono(int id,int id_usuario, String numero, String tipo, String operadora) { 
		// Constructor opcional
		this.setId(id);
		this.setNumero(numero);
		this.setTipo(tipo);
		this.setOperadora(operadora);
		this.setId_usuario(id_usuario);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

}

