/**
 * 
 */
package com.headhunt.managementportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.headhunt.managementportal.dto.ApplicationSettings;

/**
 * @author madhawa
 *
 */
@Controller
public class IndexController {
	
	@Autowired
	private ApplicationSettings appSettings; 
	

	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(Model model) {
		
		model.addAttribute("companyname","orian.solutions");
		model.addAttribute("appsettingsmodel", appSettings);
		return "index";
	}

}
