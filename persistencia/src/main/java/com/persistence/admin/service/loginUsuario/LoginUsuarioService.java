package com.persistence.admin.service.loginUsuario;

import java.util.Optional;

import com.persistence.admin.entities.LoginUsuario;

public interface LoginUsuarioService {

	Optional<LoginUsuario> buscarUsuarioPorCorreo(String correo);
	
}
