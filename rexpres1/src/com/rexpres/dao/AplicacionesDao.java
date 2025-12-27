package com.rexpres.dao;

import java.util.List;
import com.rexpres.entities.Aplicacion;

public interface AplicacionesDao {

List<Aplicacion> listaAplicaciones();

List<Aplicacion> listaAplicaciones(String namedQuery , Class<Aplicacion> resultclass);
	
}
