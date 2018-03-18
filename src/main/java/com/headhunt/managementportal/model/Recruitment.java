package com.headhunt.managementportal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="RECRUITMENT_DETAILS")
public class Recruitment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
/*	@Column(name="HEADHUNT_ID")
	private String headHuntId;*/
	// Many Recruitments one head hunter possible
	@ManyToOne
	@JoinColumn(name="HEADHUNTER_ID")
	private HeadHunter headHunter;
	
	@Column(name="RECRUITMENT_DATE")
	private String recruitmentDate;
	@Column(name="RECRUITMENT_TYPE")
	private String recruitMentType;
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "recruitment")
	private List<Employee> employee;
	// this need to be a relationship - one recruitment many employes
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public HeadHunter getHeadHunter() {
		return headHunter;
	}
	public void setHeadHunter(HeadHunter headHunter) {
		this.headHunter = headHunter;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	/*public String getHeadHuntId() {
		return headHuntId;
	}
	public void setHeadHuntId(String headHuntId) {
		this.headHuntId = headHuntId;
	}*/
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
	
	

}
