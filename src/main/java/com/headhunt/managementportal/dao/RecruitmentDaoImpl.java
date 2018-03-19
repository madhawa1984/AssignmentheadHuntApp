package com.headhunt.managementportal.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.headhunt.managementportal.model.Recruitment;

@Service("recruitmentdaoimplBean")
public class RecruitmentDaoImpl implements RecruitmentDao {
	
	@Qualifier("sessionFactoryBean")
    @Autowired
    private SessionFactory sesionFactory;

	@Override
	public List<Recruitment> getRecruitmentByHeadHuntId(long headHuntId) throws Exception {
		// TODO Auto-generated method stub
		Session session = null;
		List<Recruitment> recruitmentlist = null;
        try {
            session = this.sesionFactory.openSession();
            org.hibernate.query.Query query = session.createQuery("from Recruitment where headHunter.Id=:id"); // test to whether all the relations are saved
            query.setParameter("id", headHuntId);
            recruitmentlist = query.list();
            // hibernate initialization part will taken 
            if(!recruitmentlist.isEmpty()) {
             	for(Recruitment recruit: recruitmentlist) {
             	   Hibernate.initialize(recruit.getEmployee());	
             	   Hibernate.initialize(recruit.getHeadHunter());	 
             	}
             	// no need to add to the list since its already inside the list 
            }
            
            session.clear();
            session.close();
        }catch(Exception e) {
            e.printStackTrace();
            
        }
        finally {
            if(session!=null) {
                session.close();
            }

        }
		
		
		return recruitmentlist;
	}

	@Override
	public Recruitment getRecruitmentById(long Id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recruitment getRecruitmentByEmpId(long empId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recruitment> getAllRecruitments() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createRecruitment(Recruitment recruitment) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        Session session=null;
        try {
            session = this.sesionFactory.openSession();
            //session = this.sessionFactoryBean.getCurrentSession();
            session.beginTransaction();
            session.save(recruitment);
            session.getTransaction().commit();
            session.clear();
            session.close();
        }catch(Exception e) {
            e.printStackTrace();
            throw new Exception();

        }finally {
            if(session!=null) {
                session.close();
            }
        }
		
	}

	@Override
	public void modifyRecruitment(Recruitment recruitment) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropRecruitment(Recruitment recruitment) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
