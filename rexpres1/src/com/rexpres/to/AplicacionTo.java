package com.rexpres.to;

import java.io.Serializable;

public class AplicacionTo implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String codigo;

	private String Nombre;

	public AplicacionTo() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}
