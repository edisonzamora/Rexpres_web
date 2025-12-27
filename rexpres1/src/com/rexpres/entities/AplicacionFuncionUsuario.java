package com.rexpres.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.rexpres.entities.claves.AplicacionFuncionUsuarioId;

@Entity
@Table(name = "APLICACION_FUNCION_USUARIO")
public class AplicacionFuncionUsuario implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AplicacionFuncionUsuarioId id;

	@ManyToOne
    @MapsId("aplicacionUsuarioId")
    @JoinColumns({
        @JoinColumn(name = "id_usuario"),
        @JoinColumn(name = "id_aplicacion")
    })
	private AplicacionUsuario aplicacionUsuario;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "id_funcion")
	private Funcion funcion;

    @Column(name = "ROLE_USUARIO")
    private String role_usuario;
    
    
	public String getRole_usuario() {
		return role_usuario;
	}

	public void setRole_usuario(String role_usuario) {
		this.role_usuario = role_usuario;
	}

	public AplicacionFuncionUsuarioId getId() {
		return id;
	}

	public void setId(AplicacionFuncionUsuarioId id) {
		this.id = id;
	}

	public AplicacionUsuario getAplicacionUsuario() {
		return aplicacionUsuario;
	}

	public void setAplicacionUsuario(AplicacionUsuario aplicacionUsuario) {
		this.aplicacionUsuario = aplicacionUsuario;
	}

	public Funcion getFuncion() {
		return funcion;
	}

	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}

}
