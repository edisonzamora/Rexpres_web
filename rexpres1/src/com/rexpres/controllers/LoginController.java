package com.rexpres.controllers;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import com.rexpres.beans.LoginBean;
import com.rexpres.constant.BeansName;

@Controller
@Component(BeansName.BEAN_LOGINCONTROLLERBEAN)
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class LoginController extends CommonController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private LoginBean loginBean;
	
    public String idiomaDefecto() {
    	String id="es";
    	return id;
    }

	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}
    
}