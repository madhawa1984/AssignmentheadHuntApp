package com.headhunt.managementportal.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.headhunt.managementportal.model.HeadHunter;

@Service("headHuntDaoImpl")
public class HeadHunterDaoImpl implements HeadHunterDao {
	
	@Qualifier("sessionFactoryBean")
    @Autowired
    private SessionFactory sesionFactory;

	@Override
	public HeadHunter getHeadHunterById(long Id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HeadHunter getUserByLoginId(String loginId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createHeadHunter(HeadHunter headHuntUser) throws Exception {
		// TODO Auto-generated method stub
        Session session=null;
        try {
            session = this.sesionFactory.openSession();
            //session = this.sessionFactoryBean.getCurrentSession();
            session.beginTransaction();
            session.save(headHuntUser);
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
	public void modifyHeadHunter(HeadHunter headHuntUser) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropHeadHunter(HeadHunter headHuntUser) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public List<HeadHunter> getAllHeadHunters() throws Exception {
		// TODO Auto-generated method stub
		 Session session=null;
		 List<HeadHunter> hunterList = null;
	        try {
	        	session = this.sesionFactory.openSession();
	        	 org.hibernate.query.Query query = session.createQuery("from HeadHunter");
	             
	        	 hunterList = query.list();
	             
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
			
		return hunterList;
	}

}
