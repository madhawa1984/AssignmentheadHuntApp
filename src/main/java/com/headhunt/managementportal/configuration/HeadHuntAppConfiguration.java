package com.headhunt.managementportal.configuration;

import java.util.Map;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;

import com.headhunt.managementportal.dto.ApplicationSettings;


@Configuration
@ComponentScan("com.headhunt.managementportal")
public class HeadHuntAppConfiguration {

	
    
	@Autowired
	private ApplicationSettings appSettings;
    private Map<String,String> dataSourceDetials;

	// data source and other app configurations
    
	@Bean(name="dataSourceBean")
	public BasicDataSource getDataSource() {
		this.dataSourceDetials=appSettings.getDatasource();
		BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(dataSourceDetials.get("driver.classname"));// move the driver name to the APplicati
        dataSource.setUrl(dataSourceDetials.get("connectionstring"));
        dataSource.setUsername(dataSourceDetials.get("uname"));
        dataSource.setPassword(dataSourceDetials.get("pwd"));
		return dataSource;
	}
	
	@Bean(name="sessionFactoryBean")
	public LocalSessionFactoryBean getSessionFactory() {
	  LocalSessionFactoryBean sesfac = new LocalSessionFactoryBean();
	  sesfac.setDataSource(getDataSource());
	  sesfac.setPackagesToScan(new String[] { "com.headhunt.managementportal" });
	  Properties hibernateProperties = hibernateProperties();
	  sesfac.setHibernateProperties(hibernateProperties);
	  return sesfac;
	 }


	 Properties hibernateProperties() {
	     Properties hibernetProps = new Properties();
	     hibernetProps.setProperty("hibernate.hbm2ddl.auto", dataSourceDetials.get("hibernate.hbm2ddl.auto"));
	     hibernetProps.setProperty("hibernate.dialect", dataSourceDetials.get("hibernate.dialect"));
	     hibernetProps.setProperty("hibernate.globally_quoted_identifiers", "true");
	     hibernetProps.setProperty("show_sql",dataSourceDetials.get("hibernate.show_sql"));
	     hibernetProps.setProperty("logging.org.hibernate.tool.hbm2ddl","DEBUG");
	     hibernetProps.setProperty("logging.org.hibernate.SQL","DEBUG");
	     return hibernetProps;
	 }
	
	
}
