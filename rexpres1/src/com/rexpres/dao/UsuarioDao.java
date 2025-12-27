package com.rexpres.dao;

import java.util.List;
import java.util.Optional;
import com.rexpres.entities.Usuario;

public interface UsuarioDao{
	
public Optional<Usuario> altaUsuario(Usuario usuario);

public Optional<Usuario> userQueryId(Integer nombre);

public List<Usuario> userQueryNombreList(String nombre);

public List<Usuario> usersQueryRole(String value);

public List<Usuario> listaUsuarios();



}
