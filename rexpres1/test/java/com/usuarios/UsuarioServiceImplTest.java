package com.usuarios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.rexpres.beans.UserBean;
import com.rexpres.dao.impl.UsuarioDaoImpl;
import com.rexpres.entities.Aplicacion;
import com.rexpres.entities.AplicacionUsuario;
import com.rexpres.entities.Usuario;
import com.rexpres.entities.claves.AplicacionUsuarioId;
import com.rexpres.services.usuarios.UsuarioServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class UsuarioServiceImplTest {

	@InjectMocks
	private UsuarioServiceImpl usuarioService;
	
	@Mock
	private UsuarioDaoImpl dao;
	
	@Test
	public void Whene_usuarioByCorreo_OK() {
		
		UserBean usuario_bean=new UserBean();
		usuario_bean.setCorreo("admin@gmail.com");
		Usuario usuario_entity=new Usuario();
		usuario_entity.setNombre("Edison");
		when(dao.usuarioByCorreo(anyString())).thenReturn(Optional.of(usuario_entity));
		UserBean usuario_bean_return= usuarioService.usuarioByCorreo(usuario_bean);
		assertNotNull(usuario_bean_return);
		assertEquals("Edison",usuario_bean_return.getNombre());
	}
	
	@Test
	public void Whene_listaUsuarios_OK() {
		List<Usuario>lista_entity=new ArrayList<>(Collections.emptyList());
		lista_entity.add(mockUsuarioEntity(1));
		lista_entity.add(mockUsuarioEntity(2));
		when(dao.usuariosLista()).thenReturn(lista_entity);
		List<UserBean> lista_bean_return= usuarioService.listaUsuarios();
		assertNotNull(lista_bean_return);
		assertEquals(2, lista_bean_return.size());
		
	}
	
	private Usuario mockUsuarioEntity(Integer id) {
		Usuario entity=new Usuario();
		entity.setIdusuario(id);
		entity.setNombre("Pedro");
		entity.setApellido("Martinez");
		entity.setCorreo("pedro@gmail.com");
		entity.setActivo(1);
		List<AplicacionUsuario> lista_entity_aplicaciones=new ArrayList<>(Collections.emptyList());
		lista_entity_aplicaciones.add(mockAplicacionUsuarioEntity());
		entity.setAplicaciones(lista_entity_aplicaciones);
		return entity;
	}
	
	private Aplicacion mockAplicacionEntity(Integer id) {
		Aplicacion entity= new Aplicacion();
		entity.setId(id);
		entity.setNombre("AplicacionXX1");
		entity.setDescripcion("aplicacion descripcion");
		entity.setCodigo("APP_001");
		return entity;
	}
	
	private AplicacionUsuario mockAplicacionUsuarioEntity() {
		AplicacionUsuario entity=new AplicacionUsuario();
		AplicacionUsuarioId id=	new AplicacionUsuarioId(1L,1L);
		entity.setId(id);
		entity.setActivo(true);
		entity.setAplicacion(mockAplicacionEntity(1));
		return entity;	
	}
}
