package ec.edu.ups.modelo;

import java.io.Serializable;

public class Telefono implements Serializable{

	private static final long serialVersionUID = 1L;
	private int codigo;
	private int numero;
	private String tipo;
	private String operadora;
	private Usuario usuarioTelefono;

	public Usuario getUsuarioTelefono() {
		return usuarioTelefono;
	}

	public void setUsuarioTelefono(Usuario usuarioTelefono) {
		this.usuarioTelefono = usuarioTelefono;
	}

	public Telefono() {
		// Constructor obligatorio
	} 

	public Telefono(int codigo,int numero, String tipo, String operadora) { 
		// Constructor opcional
		this.setCodigo(codigo);
		this.setNumero(numero);
		this.setTipo(tipo);
		this.setOperadora(operadora);
		
	}

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
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


}

