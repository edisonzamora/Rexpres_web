package com.aplicaciones;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import com.rexpres.beans.AplicacionesBean;
import com.rexpres.services.aplicaciones.AplicacionesService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "classpath:spring/main-context.xml","classpath:spring/*-context.xml"
})
@Transactional
@Rollback
public class AplicacionesServiceImplIT {
	
	@Autowired
	private AplicacionesService service;
	
	@Test
	public void whene_aplicionesListNamedQuery_ok() {
	List<AplicacionesBean>list=service.aplicionesListNamedQuery();
	assertNotNull(list);
	assertNotEquals(1, list.size());
	
	}
}
