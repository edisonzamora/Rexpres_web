package com.persistence.admin.dao.impl;
import org.springframework.stereotype.Repository;

import com.persistence.admin.dao.LoginUsuarioDao;
import com.persistence.admin.entities.LoginUsuario;
import com.persistence.commos.dao.impl.CommonDaoAImpl;

@Repository
public class LoginUsuarioDaoImp extends CommonDaoAImpl<LoginUsuario>  implements LoginUsuarioDao{

	@Override
	public LoginUsuario findByCorreo(String corrreo) {
		
		LoginUsuario loginUsuario=getSessionManager()
				.createNamedQuery("loginUsuario.findByCorreo", LoginUsuario.class)
		         .setParameter("correo", corrreo)
		         .getResultStream().findFirst().orElse(null);
		return loginUsuario;
	}
	

}
