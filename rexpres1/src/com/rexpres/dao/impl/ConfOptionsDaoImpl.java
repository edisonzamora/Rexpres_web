package com.rexpres.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.persistence.commos.dao.impl.CommonDaoImpl;
import com.rexpres.dao.ConfigOptionsDao;
import com.rexpres.entities.ConfigOptions;


@Repository
public class ConfOptionsDaoImpl extends CommonDaoImpl< ConfigOptions> implements ConfigOptionsDao{

	public ConfOptionsDaoImpl() {		
		
	}

	@Override
	public List<ConfigOptions> getAllConfigOptions(String query) {
		List<ConfigOptions> list=getSessionManager().createNamedQuery(query, ConfigOptions.class).list();
		return list;
	}
	
	
	

}
