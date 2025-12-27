package com.security;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class RexpresAuthenticationFailureHandler implements AuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {

		String mensaje;
		if (exception instanceof BadCredentialsException) {
			mensaje = "Usuario o contraseña incorrectos";
			
		} else if (exception instanceof DisabledException) {
			mensaje = "Usuario deshabilitado";
			
		} else {
			
			mensaje = "Error de autenticación";
		}

		request.getSession().setAttribute("LOGIN_ERROR", mensaje);
		response.sendRedirect(request.getContextPath() + "/loginView.xhtml?faces-redirect=true");
	}

}
