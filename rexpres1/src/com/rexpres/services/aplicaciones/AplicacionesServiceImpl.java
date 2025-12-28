package com.rexpres.services.aplicaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rexpres.beans.AplicacionesBean;
import com.rexpres.dao.AplicacionesDao;
import com.rexpres.entities.Aplicacion;

@Service
public class AplicacionesServiceImpl implements AplicacionesService{

	@Autowired
	private AplicacionesDao aplicacionesDao;
	
	@Override
	@Transactional("transactionManager")
	public List<AplicacionesBean> aplicionesList() {
		List<Aplicacion> result =	aplicacionesDao.listaAplicaciones();
		List<AplicacionesBean> listResult=new ArrayList<AplicacionesBean>();
		result.stream().forEach(a ->{
			listResult.add(convertir(a));
		});
		
		return listResult;
	}
	
	@Override
	@Transactional("transactionManager")
	public List<AplicacionesBean> aplicionesListNamedQuery() {
		List<Aplicacion> result =aplicacionesDao.listaAplicaciones("aplicaciones.allList",Aplicacion.class);
		List<AplicacionesBean> listResult=result.stream()
				.map(apResult->new AplicacionesBean(
					apResult.getId(),
					apResult.getCodigo(),
					apResult.getNombre())
			).collect(Collectors.toList());
		return listResult;
	}
	
	private  AplicacionesBean convertir(Aplicacion to) {
		AplicacionesBean bean =new AplicacionesBean();
		bean.setId(to.getId());
		bean.setCodigo(to.getCodigo());
		bean.setNombre(to.getNombre());
		return bean;
	}
}
