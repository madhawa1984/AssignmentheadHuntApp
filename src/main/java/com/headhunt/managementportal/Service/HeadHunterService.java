package com.headhunt.managementportal.Service;

import java.util.List;

import com.headhunt.managementportal.dto.HeadHunterDto;

public interface HeadHunterService {
	
	public List<HeadHunterDto> getAllHeadHunters() throws Exception;
	public HeadHunterDto getHeadHunterById() throws Exception;
	public HeadHunterDto getHeadHunterByFullName() throws Exception;;
	public HeadHunterDto getHeadHunterByFirstName() throws Exception;;
	public HeadHunterDto getHeadHunterByLastName() throws Exception;;
	public HeadHunterDto saveHeadHunter(HeadHunterDto headHunter) throws Exception;;
	public HeadHunterDto modifyHeadHunter(HeadHunterDto headHunter) throws Exception;;
	public HeadHunterDto dropHeadHunter(long id) throws Exception;
	

}
