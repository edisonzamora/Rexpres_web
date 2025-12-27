package com.rexpres.services.usuarios;

import java.util.ArrayList;
import com.rexpres.beans.UserBean;
import com.rexpres.entities.Usuario;
import com.persistence.commos.service.CommonCrudService;

public interface UsuarioService extends CommonCrudService<UserBean, Usuario> {
	
	public UserBean crearUsuario (Usuario entity );
	
	public UserBean UsuarioByCorreo ( UserBean userBean );
	
	public ArrayList<UserBean> usuariosByTipo (String role);
	
	public ArrayList<UserBean> listaUsuarios();
	
	public UserBean UsuarioByNombre ( String nombre );
	
	public ArrayList<UserBean> UsuarioByNombreList ( String nombre );
	
}
