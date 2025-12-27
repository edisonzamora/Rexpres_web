package com.security.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import com.persistence.admin.entities.LoginUsuario;
import com.persistence.admin.service.loginUsuario.LoginUsuarioService;

public class UsuarioDetailsService implements UserDetailsService {

	@Autowired
	private LoginUsuarioService loginUsuarioService;
	
	public UsuarioDetailsService() {}
    
	@Transactional(readOnly = true)
	@Override
	public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
		LoginUsuario loginUsuario=loginUsuarioService.buscarUsuarioPorCorreo(correo)
				.orElseThrow(()->new UsernameNotFoundException("No se ha encontrado el usuario"));
	
		List<GrantedAuthority> roles=new ArrayList<>();
		if(loginUsuario.getRole().equalsIgnoreCase("USU"))
		roles.add(new SimpleGrantedAuthority("ROLE_"+loginUsuario.getRole()));
		
		if(loginUsuario.getRole().equalsIgnoreCase("ADM")) {
		roles.add(new SimpleGrantedAuthority("ROLE_"+loginUsuario.getRole()));
		roles.add(new SimpleGrantedAuthority("ROLE_USU"));
		}
		User usuario=new User(loginUsuario.getCorreo(), loginUsuario.getPassword(),roles );
		return usuario;
	}
	
	private  LoginUsuario buscarUsuarioPorCorreoMock(String correo) {
		LoginUsuario loginUsuario=new LoginUsuario();
		loginUsuario.setCorreo("admin");
		loginUsuario.setPassword("$2a$10$XsxL7X62GvmQ8biGie/XcuOVQ92wN1UIow2go.hRfLOPOUHcD46JK");
		return loginUsuario;
	}
}
