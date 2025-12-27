package com.rexpres.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.persistence.commos.dao.impl.CommonDaoImpl;
import com.rexpres.dao.AplicacionesDao;
import com.rexpres.entities.Aplicacion;

@Repository
public class AplicacionesDaoImpl extends CommonDaoImpl<Aplicacion> implements AplicacionesDao{

	@Override
	public List<Aplicacion> listaAplicaciones() {
		List<Aplicacion>list= getSessionManager().createNamedQuery("aplicaciones.allList", Aplicacion.class).list();
		return list;
	}
	
	@Override
	public List<Aplicacion> listaAplicaciones(String nameQuery , Class<Aplicacion> resulsetClass) {
		List<Aplicacion>list= getSessionManager().createNamedQuery(nameQuery, resulsetClass).list();
		return list;
	}
}
