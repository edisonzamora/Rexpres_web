package com.persistence.admin.service.loginUsuario;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.persistence.admin.dao.LoginUsuarioDao;
import com.persistence.admin.entities.LoginUsuario;

@Service
public class LoginUsuarioServiceImpl implements LoginUsuarioService {

	@Autowired
	private LoginUsuarioDao loginUsuarioDao;
	
	@Override
	@Transactional("transactionManagerA")
	public Optional<LoginUsuario> buscarUsuarioPorCorreo(String correo) {
		
		return Optional.ofNullable(loginUsuarioDao.findByCorreo(correo));
		
	}

}
