package com.headhunt.managementportal.dao;

import java.util.List;

import com.headhunt.managementportal.model.HeadHunter;
import com.headhunt.managementportal.model.Recruitment;

public interface RecruitmentDao {
	
	public List<Recruitment> getRecruitmentByHeadHuntId(long headHuntId) throws Exception;
	public Recruitment getRecruitmentById(long Id) throws Exception;
	public Recruitment getRecruitmentByEmpId(long empId) throws Exception;
	public List<Recruitment> getAllRecruitments() throws Exception;
    public void createRecruitment(Recruitment recruitment) throws Exception;
    public void modifyRecruitment(Recruitment recruitment) throws Exception;
    public void dropRecruitment(Recruitment recruitment) throws Exception;

}
