package com.rexpres.dao;

import java.util.List;
import java.util.Optional;
import com.rexpres.entities.Usuario;

public interface UsuarioDao{
	
public Optional<Usuario> usuarioAlta(Usuario usuario);

public Optional<Usuario> usuarioById(Integer id);

public Optional<Usuario> usuarioByCorreo(String correo);

public List<Usuario> usuariosByNombreList(String nombre);

public List<Usuario> usuariosLista();



}
