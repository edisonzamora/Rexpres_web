package com.persistence.commos.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

public class CommonDaoImpl<E> extends CrudDaoImpl<E>{

	private static final Logger logger = LogManager.getLogger(CommonDaoImpl.class);
	
//	@Autowired
//	@Qualifier("entityManagerFactory")
//	private EntityManagerFactory ent;
	@PersistenceContext(unitName = "Rexpres")
    private EntityManager ent;

	@Override
	protected EntityManager getEntityManager() throws IllegalStateException {
		logger.info("getEntityManager");
		return ent;
	}
	
	@Override
	protected Session getSessionManager() throws IllegalStateException {
		logger.info("getSessionManager");
		return ent.unwrap(Session.class);

	}

	@Override
	protected Class<E> getDaoTypeClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
