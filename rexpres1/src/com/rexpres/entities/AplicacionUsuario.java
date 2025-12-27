package com.rexpres.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
import com.rexpres.entities.claves.AplicacionUsuarioId;

public class AplicacionUsuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 
	private AplicacionUsuarioId id;
	
	private Usuario usuario;

	private Aplicacion aplicacion;

	private Boolean activo = true;

	private LocalDate fechaAlta;
	
	private LocalDate fechaBaja;

	private Set<AplicacionFuncionUsuario> funciones;


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Aplicacion getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public LocalDate getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public Set<AplicacionFuncionUsuario> getFunciones() {
		return funciones;
	}

	public void setFunciones(Set<AplicacionFuncionUsuario> funciones) {
		this.funciones = funciones;
	}

	public AplicacionUsuarioId getId() {
		return id;
	}

	public void setId(AplicacionUsuarioId id) {
		this.id = id;
	}

}
