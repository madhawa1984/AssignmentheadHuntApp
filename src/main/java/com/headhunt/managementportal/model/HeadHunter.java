package com.headhunt.managementportal.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="HEADHUNTER_DETAILS2")
public class HeadHunter implements Serializable {

	private static final long serialVersionUID = 1L;
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String LastName;
	@Column(name="DATE_REGISTRERED")
	private String registeredDate;
	public List<Recruitment> getRecruitments() {
		return recruitments;
	}
	public void setRecruitments(List<Recruitment> recruitments) {
		this.recruitments = recruitments;
	}
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "headHunter")
	private List<Recruitment> recruitments;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(String registeredDate) {
		this.registeredDate = registeredDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
