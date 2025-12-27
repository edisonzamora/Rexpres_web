package com.rexpres.controllers;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import com.rexpres.beans.AplicacionesBean;
import com.rexpres.beans.HomeBean;
import com.rexpres.beans.UserBean;
import com.rexpres.constant.BeansName;
import com.rexpres.services.aplicaciones.AplicacionesService;
import com.rexpres.services.usuarios.UsuarioService;

@Controller
@Component(BeansName.BEAN_HOMECONTROLLERBEAN)
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class HomeController extends CommonController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	@Qualifier("UsuarioService")
	private UsuarioService usuService;

	@Autowired
	private AplicacionesService aplicacionesService;

	@Autowired
	private HomeBean homeBean;

	private List<UserBean> listaUsuariosBean;

	private List<AplicacionesBean> listaAplicacionBean;

	public HomeController() {

	}

	@PostConstruct
	private void cargaListas() {
//		<ui:repeat var="item" value="#{mapBean.myMap[key]}">
//		Collections.unmodifiableList(new ArrayList<Country>(countryMap.values()))
		listaUsuariosBean = usuService.listaUsuarios();
		listaAplicacionBean = aplicacionesService.aplicionesList();
		homeBean.setListaUsuariosBean(listaUsuariosBean);
		homeBean.setListaAplicacionBean(listaAplicacionBean);

	}

	public void buscar() {

	}

	public void infoUsuario() {
		UserBean ususelect = homeBean.getUserBeanHome();
		ususelect.getActivo();
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("width", 640);
		options.put("height", 340);
		options.put("contentWidth", "100%");
		options.put("contentHeight", "100%");
		options.put("headerElement", "customheader");
		PrimeFaces.current().dialog().openDynamic("librosView", options, null);
	}

	public void geteditarEstadoAod() {
		String summary = "edits";
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
	}

	public HomeBean getHomeBean() {
		return homeBean;
	}

	public void setHomeBean(HomeBean homeBean) {
		this.homeBean = homeBean;
	}

	public List<AplicacionesBean> getListaAplicacionBean() {
		return listaAplicacionBean;
	}

	public void setListaAplicacionBean(List<AplicacionesBean> listaAplicacionBean) {
		this.listaAplicacionBean = listaAplicacionBean;
	}

	public void setListaUsuariosBean(List<UserBean> listaUsuariosBean) {
		this.listaUsuariosBean = listaUsuariosBean;
	}

	public List<UserBean> getListaUsuariosBean() {
		return listaUsuariosBean;
	}
}
