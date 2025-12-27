package com.rexpres.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
@NamedQueries({
	    @NamedQuery(name = "Usuario.listAll", query = "FROM Usuario u LEFT JOIN FETCH u.aplicaciones"),
		@NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.idusuario = :idusuario"),
		@NamedQuery(name = "Usuario.findByCorreo", query = "SELECT u FROM Usuario u WHERE u.correo = :correo"),
	    @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre")

})
public class Usuario implements Serializable {

	private static final long serialVersionUID = -4447332669027234645L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idusuario" )
	private Integer idusuario;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "correo")
	private String correo;

	@Column(name = "activo")
	private Integer activo;
	
	 @OneToMany(mappedBy = "usuario")
	 private List<AplicacionUsuario> aplicaciones;

	
	public List<AplicacionUsuario> getAplicaciones() {
		return aplicaciones;
	}

	 public void setAplicaciones(List<AplicacionUsuario> aplicaciones) {
		 this.aplicaciones = aplicaciones;
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


	public Usuario() {
		super();
	}

	@Override
	public String toString() {
		return "Usuario [idusuario=" + idusuario + ", nombre=" + nombre + ", apellido=" + apellido + ", correo="
				+ correo + ", activo=" + activo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(activo, apellido, aplicaciones, correo, idusuario, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(activo, other.activo) && Objects.equals(apellido, other.apellido)
				&& Objects.equals(aplicaciones, other.aplicaciones) && Objects.equals(correo, other.correo)
				&& Objects.equals(idusuario, other.idusuario) && Objects.equals(nombre, other.nombre);
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	

	
}
