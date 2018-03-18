package com.headhunt.managementportal.Service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.headhunt.managementportal.dao.HeadHunterDao;

import com.headhunt.managementportal.dto.HeadHunterDto;
import com.headhunt.managementportal.model.HeadHunter;


@Service("headHuntServiceImpl")
public class HeadHunterServiceImpl implements HeadHunterService {
	
    @Qualifier("headHuntDaoImpl")
    @Autowired
    private HeadHunterDao headHunterDao;
	
	

	@Override
	public HeadHunterDto getHeadHunterById() {
		
		return null;
	}

	@Override
	public HeadHunterDto getHeadHunterByFullName() {
		
		return null;
	}

	@Override
	public HeadHunterDto getHeadHunterByFirstName() {
		
		return null;
	}

	@Override
	public HeadHunterDto getHeadHunterByLastName() {
		// TODO Auto-generated method stub
		return null;
	}


	
	@Override
	public HeadHunterDto saveHeadHunter(HeadHunterDto headHunter) throws Exception {
		headHunterDao.createHeadHunter(mapHeadHunterDto2Entity(headHunter));
		return null;
	}

	@Override
	public HeadHunterDto modifyHeadHunter(HeadHunterDto headHunter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HeadHunterDto dropHeadHunter(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public List<HeadHunterDto> getAllHeadHunters() throws Exception {
		// TODO Auto-generated method stub
		List<HeadHunter> list = headHunterDao.getAllHeadHunters();
		List<HeadHunterDto> dtolist = new ArrayList<HeadHunterDto>();
		
		for(HeadHunter headHunter:list) {
			dtolist.add(Entity2tomapHeadHunter(headHunter));
		}
		return dtolist;
	}
	
	private HeadHunter mapHeadHunterDto2Entity(HeadHunterDto headHunter) {
		HeadHunter headHunterEntity = new HeadHunter(); 
		headHunterEntity.setId(headHunter.getId());
		headHunterEntity.setFirstName(headHunter.getFirstName());
		headHunterEntity.setLastName(headHunter.getLastName());
		headHunterEntity.setRegisteredDate(headHunter.getRegisteredDate());
		return headHunterEntity;
	}

	private HeadHunterDto Entity2tomapHeadHunter(HeadHunter headHunter) {
		HeadHunterDto headHunterDto = new HeadHunterDto(); 
		headHunterDto.setId(headHunter.getId());
		headHunterDto.setFirstName(headHunter.getFirstName());
		headHunterDto.setLastName(headHunter.getLastName());
		headHunterDto.setRegisteredDate(headHunter.getRegisteredDate());
		return headHunterDto;
	}
}

