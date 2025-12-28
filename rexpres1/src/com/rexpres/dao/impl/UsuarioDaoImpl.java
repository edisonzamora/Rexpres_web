package com.rexpres.dao.impl;

import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.persistence.commos.dao.impl.CommonDaoImpl;
import com.rexpres.dao.UsuarioDao;
import com.rexpres.entities.Usuario;

@Repository
public class UsuarioDaoImpl extends CommonDaoImpl<Usuario> implements UsuarioDao {

	private static final Logger logger = LogManager.getLogger(UsuarioDaoImpl.class);

	@Override
	public Class<Usuario> getDaoTypeClass() {
		return Usuario.class;
	}

	@Override
	public List<Usuario> usuariosLista() {
		logger.info("listaUsuarios");		
		List<Usuario> list=getEntityManager()
				.createNamedQuery("Usuario.listAll",Usuario.class)
				.getResultList();
		return list;
	}

	@Override
	public Optional<Usuario> usuarioById(Integer id) {
		logger.info("userQueryId");

		Usuario usuario=  getEntityManager().createNamedQuery("Usuario.findById",Usuario.class)
				.setParameter("idusuario", id)
				.getSingleResult();
		return Optional.ofNullable(usuario);
	}

	@Override
	public List<Usuario> usuariosByNombreList(String nombre) {
		logger.info("userQueryNombreList");
		List<Usuario> listaUsuarios = getEntityManager().createNamedQuery("Usuario.findByNombre",Usuario.class)
				.setParameter("nombre", nombre)
				.getResultList();
		return listaUsuarios;
	}

	@Override
	public Optional<Usuario> usuarioAlta(Usuario usuario) {
		getSessionManager().persist(usuario);
		return null;
	}

	@Override
	public Optional<Usuario> usuarioByCorreo(String correo) {
		logger.info("usuarioByCorreo");
		Usuario usuario=  getEntityManager().createNamedQuery("Usuario.findByCorreo",Usuario.class)
				.setParameter("correo", correo)
				.getSingleResult();
		return Optional.ofNullable(usuario);
	}


}
