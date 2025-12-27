package com.rexpres.services.usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.persistence.commos.service.impl.CommonServicesImpl;
import com.rexpres.beans.AplicacionesBean;
import com.rexpres.beans.UserBean;
import com.rexpres.dao.UsuarioDao;
import com.rexpres.entities.Usuario;

@Service("UsuarioService")
public class UsuarioServiceImp extends CommonServicesImpl<UserBean, Usuario> implements UsuarioService {

	@Autowired
	private UsuarioDao usuariodao;

	@Override
	@Transactional("transactionManager")
	public UserBean UsuarioByCorreo(UserBean userBean) {
		return null;
	}

	@Override
	@Transactional("transactionManager")
	public ArrayList<UserBean> usuariosByTipo(String role) {
		ArrayList<Usuario> usuarios = null;
		if (role.equalsIgnoreCase("ADM")) {
			usuarios = (ArrayList<Usuario>) usuariodao.usersQueryRole(role);
		}
		if (role.equalsIgnoreCase("USU")) {
			usuarios = (ArrayList<Usuario>) usuariodao.usersQueryRole(role);
		}

		return (ArrayList<UserBean>) usuarioToUserBeanList(usuarios);
	}

	@Override
	@Transactional("transactionManager")
	public UserBean crearUsuario(Usuario entity) {
		try {
			usuariodao.altaUsuario(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional("transactionManager")
	public ArrayList<UserBean> listaUsuarios() {
		ArrayList<Usuario> usuarios = (ArrayList<Usuario>) usuariodao.listaUsuarios();
		return (ArrayList<UserBean>) usuarioToUserBeanList(usuarios);
	}

	@Override
	@Transactional("transactionManager")
	public UserBean UsuarioByNombre(String nombre) {
		// Usuario user = usuariodao.userQueryNombre(nombre);
		UserBean userBean = new UserBean();
		// usuarioToUserbean(userBean, user);
		return userBean;
	}

	@Override
	@Transactional("transactionManager")
	public ArrayList<UserBean> UsuarioByNombreList(String nombre) {
		ArrayList<Usuario> usuarios = (ArrayList<Usuario>) usuariodao.userQueryNombreList(nombre);
		return (ArrayList<UserBean>) usuarioToUserBeanList(usuarios);
	}

	private List<UserBean> usuarioToUserBeanList(List<Usuario> listUsuariosEntity) {

		List<UserBean> listUsuariosbean = listUsuariosEntity.stream()
				.map(usuarioEntity -> {
					UserBean userBean = new UserBean();
					usuarioToUserbean(userBean,usuarioEntity);
                    userBean.setAplicacionesBeans(usuarioEntity.getAplicaciones().stream()
                    		.map(aplicacionesEntity -> {
                    			AplicacionesBean aplicacionesBean = new AplicacionesBean();
                    			   aplicacionesBean.setId(aplicacionesEntity.getAplicacion().getId());
				return aplicacionesBean;
			}).collect(Collectors.toList()));
			return userBean;
		}).collect(Collectors.toList());

		return listUsuariosbean;
	}
	
	private UserBean usuarioToUserbean(UserBean user, Usuario entity) {
		/*
		 * cambia la entidad a usuarioBean
		 */
		user.setIdusuario(entity.getIdusuario());
		user.setNombre(entity.getNombre());
		user.setApellido(entity.getApellido());
		user.setCorreo(entity.getCorreo());
		user.setActivo(entity.getActivo());
		return user;
	}

	
	private Usuario userBeanToUsuario(Usuario entity, UserBean user) {
		/*
		 * cambia de userBean a Entity
		 */
		entity.setIdusuario(user.getIdusuario());
		entity.setNombre(user.getNombre());
		entity.setApellido(user.getApellido());
		entity.setCorreo(user.getCorreo());
		entity.setActivo(user.getActivo());
		return entity;
	}
}
