package com.rexpres.entities.claves;

import java.io.Serializable;
import java.util.Objects;

public class AplicacionUsuarioId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idUsuario;
	
	private Long idAplicacion;

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

	@Override
	public int hashCode() {
		return Objects.hash(idAplicacion, idUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AplicacionUsuarioId other = (AplicacionUsuarioId) obj;
		return Objects.equals(idAplicacion, other.idAplicacion) && Objects.equals(idUsuario, other.idUsuario);
	}

}
