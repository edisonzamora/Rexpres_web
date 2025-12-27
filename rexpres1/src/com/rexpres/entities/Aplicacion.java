package com.rexpres.entities;

import java.io.Serializable;
import java.util.Objects;

public class Aplicacion  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String codigo;
	
	private String Nombre;
	
	private String descripcion;
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(Nombre, codigo, descripcion, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aplicacion other = (Aplicacion) obj;
		return Objects.equals(Nombre, other.Nombre) && Objects.equals(codigo, other.codigo)
				&& Objects.equals(descripcion, other.descripcion) && Objects.equals(id, other.id);
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


}
