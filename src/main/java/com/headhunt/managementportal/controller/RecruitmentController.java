package com.headhunt.managementportal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.headhunt.managementportal.Service.RecruitmentService;
import com.headhunt.managementportal.dto.EmployeeDto;
import com.headhunt.managementportal.dto.HeadHunterDto;
import com.headhunt.managementportal.dto.RecruitmentDto;

@Controller
public class RecruitmentController {
	
	@Qualifier("recruitmentServiceBean")
	@Autowired
	private RecruitmentService recruitmentService; 
	
	@RequestMapping(value="/registerRecruitment",method=RequestMethod.GET)
	public String recruitmentForm(Model model) throws Exception {
		RecruitmentDto inialfrm = new RecruitmentDto();
		List<EmployeeDto> listOfEmployee = new ArrayList<EmployeeDto>();
		listOfEmployee.add(new EmployeeDto());
		inialfrm.setListOfEmployee(listOfEmployee);
		model.addAttribute("recruitmentDtoKey",inialfrm);
		return "recruitmentform";
	}
	
	@RequestMapping(value="/saveRecruitment",method=RequestMethod.POST)
	public String saveRecruitment(@ModelAttribute RecruitmentDto recruitment, BindingResult errors, Model model) throws Exception {
		recruitmentService.saveRecruitments(recruitment);
		return "Results";
	}

}

