package com.rexpres.services.usuarios;

import java.util.List;
import com.persistence.commos.service.CommonCrudService;
import com.rexpres.beans.UserBean;
import com.rexpres.entities.Usuario;

public interface UsuarioService extends CommonCrudService<UserBean, Usuario> {
	
	public UserBean crearUsuario (Usuario entity );
	
	public UserBean usuarioByCorreo ( UserBean userBean );
	
	public List<UserBean> listaUsuarios();
	
	public UserBean usuarioByNombre ( String nombre );
	
	public List<UserBean> usuarioByNombreList ( String nombre );
	
}
