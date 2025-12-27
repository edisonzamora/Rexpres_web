package com.rexpres.beans;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.model.SelectItem;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import com.conf.common.utils.RexUtil;
import com.rexpres.constant.BeansName;


@Component(BeansName.BEAN_LOGINBEAN)
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class LoginBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String idioma;
	
	private ArrayList<SelectItem>idiomas;
	
	public ArrayList<SelectItem> getIdiomas() {
		idiomas=listIdioma();
		return idiomas;
	}
	public void setIdiomas(ArrayList<SelectItem> idiomas) {
		this.idiomas = idiomas;
	}
	private ArrayList<SelectItem> listIdioma() {
		return arrayListToSelectetList(getIdiomasNavegador());
	}
	public String getIdioma() {
		idioma= idioma == null ? "es": idioma;
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	private ArrayList<SelectItem> arrayListToSelectetList( ArrayList<String> list){
		ArrayList<SelectItem>listSelectet=new ArrayList<SelectItem>();
		for (String valor : list) {
			
			listSelectet.add(new SelectItem(valor, valor));
		}
		return listSelectet;
	}
	/**
	 * devuelve lista de los idiomas del navegador
	 * 
	 * */
	private ArrayList<String> getIdiomasNavegador() {
		ArrayList<String>lista=(ArrayList<String>) RexUtil.idiomasNavegador();
		return lista;
	}
	
}
