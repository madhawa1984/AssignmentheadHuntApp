package com.headhunt.managementportal.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.headhunt.managementportal.dao.HeadHunterDao;
import com.headhunt.managementportal.dao.RecruitmentDao;
import com.headhunt.managementportal.dto.EmployeeDto;
import com.headhunt.managementportal.dto.RecruitmentDto;
import com.headhunt.managementportal.model.Employee;
import com.headhunt.managementportal.model.Recruitment;

@Service("recruitmentServiceBean")
public class RecruitmentServiceImpl implements RecruitmentService {
	
	@Qualifier("headHuntDaoImpl")
	@Autowired
	private HeadHunterDao headHunterDao;
	
	@Qualifier("recruitmentdaoimplBean")
	@Autowired
	private RecruitmentDao recruitmentdao;
	
	@Override
	public List<RecruitmentDto> getAllRecruitments() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecruitmentDto getRecruitmentById() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RecruitmentDto> getHRecruitmentsByHunterId() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecruitmentDto saveRecruitments(RecruitmentDto recruitmentdto) throws Exception {
		// TODO Auto-generated method stub
		// set the relation ships
		Recruitment recruitment = mapRecruitmentDto2Entity(recruitmentdto);
		// recruitment
		// get HeadHunter data from DB and set to the recruitment
		recruitment.setHeadHunter(
				headHunterDao.getHeadHunterById(Long.parseLong(recruitmentdto.getHeadHuntId())));
		
		recruitmentdao.createRecruitment(recruitment);
		return null;
	}

	@Override
	public RecruitmentDto modifyRecruitments(RecruitmentDto recruitmentdto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecruitmentDto dropRecruitments(long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Recruitment mapRecruitmentDto2Entity(RecruitmentDto recruitmentdto) {
		Recruitment recruitment = new Recruitment(); 
		recruitment.setId(recruitmentdto.getId());
		List<Employee> list = new ArrayList<Employee>();
		// extract Employee data list and set to the 
		for(EmployeeDto empDto:recruitmentdto.getListOfEmployee()) {
			Employee emp = new Employee();
			emp.setId(empDto.getId());
			emp.setEmployeeFirstName(empDto.getEmployeeFirstName());
			emp.setEmployeeLastName(empDto.getEmployeeLastName());
			emp.setSkill(empDto.getSkill());
			list.add(emp);
		}
		recruitment.setEmployee(list);
		recruitment.setRecruitmentDate(recruitmentdto.getRecruitmentDate());
		recruitment.setRecruitMentType(recruitmentdto.getRecruitMentType());
		return recruitment;
	}

	private RecruitmentDto Entity2tomapHeadHunter(Recruitment recruitment) {
		/*RecruitmentDto recruitmentdto = new RecruitmentDto(); 
		recruitmentdto.setId(recruitment.getId());
		recruitmentdto.setFirstName(recruitment.get); // employe details
		recruitmentdto.setLastName(headHunter.getLastName());
		recruitmentdto.setRegisteredDate(headHunter.getRegisteredDate());
		return recruitmentdto;*/
		return null;
	}
	

}
