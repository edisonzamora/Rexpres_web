package com.rexpres.services.configoptions;

import java.util.List;
import org.springframework.stereotype.Service;
import com.rexpres.to.ConfigOptionsTo;

@Service
public interface ConfOptionsService  {

	List<ConfigOptionsTo> allConfigOrtions();
		
	
}
