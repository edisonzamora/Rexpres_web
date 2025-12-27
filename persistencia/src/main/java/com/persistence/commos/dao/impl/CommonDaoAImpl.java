package com.persistence.commos.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

public class CommonDaoAImpl<E> extends CrudDaoImpl<E>{
	private static final Logger logger = LogManager.getLogger(CommonDaoAImpl.class);

//	@Autowired
//	@Qualifier("entityManagerFactoryA")
//	private EntityManagerFactory entA;
	@PersistenceContext(unitName = "Rexpres2")
    private EntityManager entA;

	@Override
	protected EntityManager getEntityManager() throws IllegalStateException{
		logger.info("getEntityManagerA");
		return entA;
	}
	@Override
	protected Session getSessionManager() throws IllegalStateException{
		logger.info("getSessionManagerA");
		return entA.unwrap(Session.class);
	}

	@Override
	protected Class<E> getDaoTypeClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
