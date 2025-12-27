package com.security;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class RexpresAccessDeniedHandler  implements AccessDeniedHandler {

    @Override
    public void handle(
        HttpServletRequest request,
        HttpServletResponse response,
        AccessDeniedException ex)
        throws IOException {
    	/**
    	 * redirigimos a la parte publica ya que no tiene autorizacion para la parte privada
    	 * */
       //request.getSession(true);
       // request.getSession().setAttribute("ACCESS_DENIED_MSG","No tienes permisos para acceder a esta opción");
       // response.sendRedirect(request.getContextPath() + "/loginView.xhtml?faces-redirect=true");
    	response.sendRedirect(request.getContextPath()+"/modulo/home");
    }
}

