package com.headhunt.managementportal.dao;

import java.util.List;

import com.headhunt.managementportal.model.HeadHunter;

public interface HeadHunterDao {
	public List<HeadHunter> getAllHeadHunters() throws Exception;
	public HeadHunter getHeadHunterById(long Id) throws Exception;
    public HeadHunter getUserByLoginId(String loginId) throws Exception;
    public void createHeadHunter(HeadHunter headHuntUser) throws Exception;
    public void modifyHeadHunter(HeadHunter headHuntUser) throws Exception;
    public void dropHeadHunter(HeadHunter headHuntUser) throws Exception;
}
