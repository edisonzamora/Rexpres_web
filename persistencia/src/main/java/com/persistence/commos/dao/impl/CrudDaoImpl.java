package com.persistence.commos.dao.impl;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import com.persistence.commos.dao.CrudDao;

public abstract class CrudDaoImpl<E> implements CrudDao  {

	/** 
	 * 
	 * **/
	protected abstract EntityManager getEntityManager() ;
	
//	protected abstract EntityManager setEntityManager() ;
	
	/**
	 * delega la conececcion a gestor de sesiones de hibernate
	 * 
	 * **/
	protected abstract Session getSessionManager() ;
	
	/**
	 * metodo de la interface implementadao 
	 * convertida abract para gestinarla en la implementacion common
	 * **/
	protected abstract Class<E> getDaoTypeClass();
	
	
	/**
	 * @API JPA RESOLVE QUERY NAMEDQUERY HQL /JPQL
	 * **/

//	protected TypedQuery<?> createNamedQueryJPA(String namedQuery ,Class<?> resultClass) {
//		return getEntityManager().createNamedQuery(namedQuery,resultClass);
//	}
	
	
	/**
	 * API JPA RESOLVE QUERY CREATEQUERY HQL /JPQL
	 * 
	 * **/
//	protected Query createQueryJPA(String Sqlquey){
//		return getEntityManager().createQuery(Sqlquey);
//	}
//	
//	protected Query createQueryJPA(String quey, Class<?> clase){
//		return getEntityManager().createQuery(quey,clase);
//	}
	
	/** 
	 *
	 * api JPA API RESOLVE NATIVE QUERY SQL 
	 * */
//	protected Query createNativeQueryJPA(String queryString) {
//		
//		return getEntityManager().createNativeQuery(queryString);
//	}
//	
//	protected Query createNativeQueryJPA(String queryString , Class<?> resultClass ) {
//		return getEntityManager().createNativeQuery(queryString, resultClass);
//				
//	}
//	
//	protected Query createNativeQueryJPA(String queryString , String resulsetMaping) {
//		return getEntityManager().createNativeQuery(queryString, resulsetMaping);
//				
//	}
//	
//	protected Session createSessionQuery(String nameQuery) {
//		return getSessionManager();
//		}
//	
//	protected  Query createSessionNamedQuery(String nameQuery, Class<?> resultClass) {
//		return  getSessionManager().createNamedQuery(nameQuery,resultClass);
//	}
//	
//	protected Query createSessionHQLQuery(String queryString , Class<?> clase) {
//		return getSessionManager().createQuery(queryString,clase );
//	}
//	
//	protected NativeQuery<?> createSessionNameNativeQuery(String named) {
//		return  getSessionManager().getNamedNativeQuery(named);
//		
//	}
//	protected NativeQuery<?> createSessionNativeQuery(String queryString) {
//		return getSessionManager().createNativeQuery(queryString);
//				
//	}
//	protected NativeQuery<?> createSessionNativeQuery(String queryString , String resulsetMaping) {
//		return getSessionManager().createNativeQuery(queryString, resulsetMaping);
//	}
//	
	protected void create(E entity) throws IllegalStateException {
			    EntityManager ent = getEntityManager();
				ent.getTransaction().begin();
				ent.persist(entity);
				ent.getTransaction().commit();
				ent.close();	 
	}
}
