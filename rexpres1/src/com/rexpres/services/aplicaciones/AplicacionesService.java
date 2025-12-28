package com.rexpres.services.aplicaciones;

import java.util.List;
import com.rexpres.beans.AplicacionesBean;

public interface AplicacionesService {

	List<AplicacionesBean> aplicionesList();
	
	List<AplicacionesBean> aplicionesListNamedQuery();
}
