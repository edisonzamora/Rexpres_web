package com.aplicaciones;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyObject;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.rexpres.beans.AplicacionesBean;
import com.rexpres.dao.AplicacionesDao;
import com.rexpres.entities.Aplicacion;
import com.rexpres.services.aplicaciones.AplicacionesServiceImpl;



/**
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class AplicacionesServiceImplTest {

	@InjectMocks
	private AplicacionesServiceImpl aplicacionesService;
	
	@Mock
	private AplicacionesDao dao;
	
	@Test
	public void whene_aplicionesList_isOk() {
		Aplicacion ap=new Aplicacion();
		List<Aplicacion> list=new ArrayList<>();
		list.add(ap);
		when(dao.listaAplicaciones()).thenReturn(list);
		List<AplicacionesBean>listReturn=aplicacionesService.aplicionesList();
		assertEquals(1L, listReturn.size());
	}
	@Test
	public void whene_aplicionesListNamedQuery_isOk() {
		Aplicacion ap=new Aplicacion();
		List<Aplicacion> list=new ArrayList<>();
		list.add(ap);
		when(dao.listaAplicaciones(anyString(),anyObject())).thenReturn(list);
		List<AplicacionesBean>listReturn=aplicacionesService.aplicionesListNamedQuery();
		assertEquals(1L, listReturn.size());
	}
}
