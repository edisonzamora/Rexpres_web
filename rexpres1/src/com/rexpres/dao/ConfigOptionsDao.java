package com.rexpres.dao;

import java.util.List;

import com.rexpres.entities.ConfigOptions;

public interface ConfigOptionsDao{

     List<ConfigOptions> getAllConfigOptions(String query );
	
}
