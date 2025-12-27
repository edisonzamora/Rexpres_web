package com.persistence.admin.dao;

import com.persistence.admin.entities.LoginUsuario;

public interface LoginUsuarioDao {

	
public LoginUsuario findByCorreo(String corrreo);
}
