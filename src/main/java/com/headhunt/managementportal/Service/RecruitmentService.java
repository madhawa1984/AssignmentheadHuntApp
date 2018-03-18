package com.headhunt.managementportal.Service;

import java.util.List;

import com.headhunt.managementportal.dto.RecruitmentDto;

public interface RecruitmentService {
	
	public List<RecruitmentDto> getAllRecruitments() throws Exception;
	public RecruitmentDto getRecruitmentById() throws Exception;
	public List<RecruitmentDto> getHRecruitmentsByHunterId() throws Exception;;
	public RecruitmentDto saveRecruitments(RecruitmentDto recruitment) throws Exception;;
	public RecruitmentDto modifyRecruitments(RecruitmentDto recruitment) throws Exception;;
	public RecruitmentDto dropRecruitments(long id) throws Exception;

}
