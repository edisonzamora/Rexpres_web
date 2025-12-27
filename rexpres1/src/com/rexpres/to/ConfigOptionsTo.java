package com.rexpres.to;

import java.io.Serializable;

public class ConfigOptionsTo implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String valor;
	private String activo;
	
	
	public ConfigOptionsTo() {
		// TODO Auto-generated constructor stub
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}


	public String getActivo() {
		return activo;
	}


	public void setActivo(String activo) {
		this.activo = activo;
	}
	
	

}
