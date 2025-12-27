package com.rexpres.beans;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import com.rexpres.constant.BeansName;

@Component(BeansName.BEAN_USERBEAN)
@Scope(value = WebApplicationContext.SCOPE_SESSION)
public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Integer idusuario;

	private String nombre;

	private String apellido;

	private String correo;

	private Integer activo;

	private String idioma;

	private List<AplicacionesBean> aplicacionesBeans;

	public UserBean(Integer idusuario, String nombre, String apellido, String correo, Integer activo,
			String idioma, List<AplicacionesBean> aplicacionesBeans) {
		super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.activo = activo;
		this.idioma = idioma;
		this.aplicacionesBeans = aplicacionesBeans;
	}

	public UserBean() {
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
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

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public List<AplicacionesBean> getAplicacionesBeans() {
		return aplicacionesBeans;
	}

	public void setAplicacionesBeans(List<AplicacionesBean> aplicacionesBeans) {
		this.aplicacionesBeans = aplicacionesBeans;
	}
	
}
