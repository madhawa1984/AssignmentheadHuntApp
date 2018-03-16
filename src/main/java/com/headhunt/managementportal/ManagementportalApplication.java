package com.headhunt.managementportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.headhunt.managementportal.dto.ApplicationSettings;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationSettings.class)
public class ManagementportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementportalApplication.class, args);
	}
}
