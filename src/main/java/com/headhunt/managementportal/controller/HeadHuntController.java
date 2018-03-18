package com.headhunt.managementportal.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.headhunt.managementportal.Service.HeadHunterService;
import com.headhunt.managementportal.dto.HeadHunterDto;

@Controller
public class HeadHuntController {
	
    @Qualifier("headHuntServiceImpl")
	@Autowired
	private HeadHunterService headHunter;
	
	@RequestMapping(value="/headhunters",method=RequestMethod.GET)
	public String viewHeadHunters(Model model) throws Exception {
		model.addAttribute("ListOfheadHunters", headHunter.getAllHeadHunters());
		return "headhunterslist";
	}
	
	@RequestMapping(value="/headHunterfrm",method=RequestMethod.GET)
	public String HeadHunterregisterView(Model model) {
		model.addAttribute("headHunter",new HeadHunterDto()); // empty form
		return "registerheadhunterform";
	}
	
	@RequestMapping(value="/saveHeadHunter",method=RequestMethod.POST)
	public String saveHeadHunter(@ModelAttribute HeadHunterDto headHunt, BindingResult errors, Model model) throws Exception {
		
		headHunter.saveHeadHunter(headHunt);
		// head hunt service save method
		model.addAttribute("results","HeadHunter "+headHunt.getFirstName()+" "+headHunt.getLastName()+" is Successfully Added"); // add the saved object details as well
		return "Results";
	}
	
	
}
