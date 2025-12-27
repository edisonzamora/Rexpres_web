package com.rexpres.services.configoptions;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rexpres.dao.ConfigOptionsDao;
import com.rexpres.entities.ConfigOptions;
import com.rexpres.to.ConfigOptionsTo;

@Service
public class ConfOptionsServiceImpl implements ConfOptionsService{

	@Autowired
	private  ConfigOptionsDao configOptionsDao;
	
	public ConfOptionsServiceImpl() {}

	@Override
	public List<ConfigOptionsTo> allConfigOrtions() {
		List<ConfigOptions> list= configOptionsDao.getAllConfigOptions("listaOpciones");
		List<ConfigOptionsTo> listTo= converteModelListforToList(list);
		return listTo;
	}
	
	private ConfigOptionsTo converteModelforTo(ConfigOptions model) {
		ConfigOptionsTo confOTo=new ConfigOptionsTo();
		confOTo.setNombre(model.getNombre());
		confOTo.setValor(model.getValor());
		confOTo.setActivo(Integer.toString( model.getActivo()));
		return confOTo;
	}

	private  List<ConfigOptionsTo> converteModelListforToList(List<ConfigOptions> model) {
		List<ConfigOptionsTo> listTo= new ArrayList<ConfigOptionsTo>();
		for (ConfigOptions configOption : model) {
			listTo.add(converteModelforTo(configOption));
		}
		return listTo;
	}
	
	
}
