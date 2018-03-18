package com.headhunt.managementportal.dto;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="application")
public class ApplicationSettings {
	
	private String name;
	private String execution_profile;
	private Map<String,String> datasource;
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getExecution_profile() {
		return execution_profile;
	}
	public final void setExecution_profile(String execution_profile) {
		this.execution_profile = execution_profile;
	}
	public final Map<String, String> getDatasource() {
		return datasource;
	}
	public final void setDatasource(Map<String, String> datasource) {
		this.datasource = datasource;
	}
	
	// final getters and setters will not be overriden at subclass level
	

}
