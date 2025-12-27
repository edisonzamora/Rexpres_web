package com.persistence.admin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "LOGINUSUARIO")
@NamedQueries({
	@NamedQuery(name = "loginUsuario.findByCorreo", query = "FROM LoginUsuario lu WHERE lu.correo = :correo")
})
public class LoginUsuario {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID" )
	private Integer id;
	
	@Column(name = "CORREO", nullable = false, unique = true)
	private String correo;
	
	@Column(name = "PASSWORD", nullable = false)
	private String password;

	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "ROLE")
	private String role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
