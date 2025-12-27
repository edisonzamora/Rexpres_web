package com.rexpres.entities;

import java.io.Serializable;
import java.util.Objects;

public class Funcion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer Id;

	private String codigo;

	private String nombre;

	private String descripcion;
	
	private Aplicacion aplicacion;
	
	

	@Override
	public int hashCode() {
		return Objects.hash(Id, aplicacion, codigo, descripcion, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcion other = (Funcion) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(aplicacion, other.aplicacion)
				&& Objects.equals(codigo, other.codigo) && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(nombre, other.nombre);
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Aplicacion getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

}
