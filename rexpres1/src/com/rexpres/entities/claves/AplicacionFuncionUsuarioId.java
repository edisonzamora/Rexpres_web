package com.rexpres.entities.claves;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AplicacionFuncionUsuarioId implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "id_usuario")
	private Long idUsuario;
	
	@Column(name = "id_aplicacion")
    private Long idAplicacion;
    
	@Column(name = "id_funcion")
	private Long idFuncion;

	
	
	@Override
	public int hashCode() {
		return Objects.hash(idAplicacion, idFuncion, idUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AplicacionFuncionUsuarioId other = (AplicacionFuncionUsuarioId) obj;
		return Objects.equals(idAplicacion, other.idAplicacion) && Objects.equals(idFuncion, other.idFuncion)
				&& Objects.equals(idUsuario, other.idUsuario);
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdAplicacion() {
		return idAplicacion;
	}

	public void setIdAplicacion(Long idAplicacion) {
		this.idAplicacion = idAplicacion;
	}

	public Long getIdFuncion() {
		return idFuncion;
	}

	public void setIdFuncion(Long idFuncion) {
		this.idFuncion = idFuncion;
	}
	
}
