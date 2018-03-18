package com.headhunt.managementportal.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecruitmentDto {
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getHeadHuntId() {
		return headHuntId;
	}
	public void setHeadHuntId(String headHuntId) {
		this.headHuntId = headHuntId;
	}
	
	public List<EmployeeDto> getListOfEmployee() {
		return listOfEmployee;
	}
	public void setListOfEmployee(List<EmployeeDto> listOfEmployee) {
		this.listOfEmployee = listOfEmployee;
	}

	public String getRecruitmentDate() {
		return recruitmentDate;
	}
	public void setRecruitmentDate(String recruitmentDate) {
		this.recruitmentDate = recruitmentDate;
	}
	public String getRecruitMentType() {
		return recruitMentType;
	}
	public void setRecruitMentType(String recruitMentType) {
		this.recruitMentType = recruitMentType;
	}
	public Map<String, String> getPossibleRecruitMentTypes() {
		return possibleRecruitMentTypes;
	}
	private Map<String, String> possibleRecruitMentTypes = new HashMap<String, String>() {
		{
			put("Individual", "Individual");
			put("Group", "Group");
		}
	};
	
	private Long id;
	private String headHuntId;
	private List<EmployeeDto> listOfEmployee;
	private String recruitmentDate;
	private String recruitMentType;
	
	


}
