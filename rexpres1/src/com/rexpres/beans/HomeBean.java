package com.rexpres.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import com.rexpres.constant.BeansName;
import com.rexpres.to.ConfigOptionsTo;

@Component(BeansName.BEAN_HOMEBEAN)
@Scope(value = WebApplicationContext.SCOPE_SESSION)
public class HomeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private UserBean userBeanHome;

	private String buscador;
	
	private String selectCamp;
	
	private List<UserBean> listaUsuariosBean;
	
	private List<AplicacionesBean> listaAplicacionBean;
	
	public List<AplicacionesBean> getListaAplicacionBean() {
		return listaAplicacionBean;
	}

	public void setListaAplicacionBean(List<AplicacionesBean> listaAplicacionBean) {
		this.listaAplicacionBean = listaAplicacionBean;
	}

	private List<ConfigOptionsTo> listaConfigOptions;
	
	

	public String getSelectCamp() {
		return selectCamp;
	}

	public void setSelectCamp(String selectCamp) {
		this.selectCamp = selectCamp;
	}

	public UserBean getUserBeanHome() {
		return userBeanHome;
	}

	public void setUserBeanHome(UserBean userBeanHome) {
		this.userBeanHome = userBeanHome;
	}

	public String getBuscador() {
		return buscador;
	}

	public HomeBean() {

	}

	public void setBuscador(String buscado) {
		this.buscador = buscado;
	}
	
	public List<UserBean> getListaUsuariosBean() {
		return listaUsuariosBean;
	}
	
	public void setListaUsuariosBean(List<UserBean> listaUsuariosBean) {
		this.listaUsuariosBean = listaUsuariosBean;
	}

	public List<ConfigOptionsTo> getListaConfigOptions() {
		return listaConfigOptions;
	}

	public void setListaConfigOptions(ArrayList<ConfigOptionsTo> listaConfigOptions) {
		this.listaConfigOptions = listaConfigOptions;
	}

	

}
