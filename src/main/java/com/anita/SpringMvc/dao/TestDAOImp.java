package com.anita.SpringMvc.dao;


import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anita.SpringMvc.Entity.Myapp_Register;

@Component
public class TestDAOImp implements TestDAO {
	@Autowired
   private SessionFactory sessionFactory;
   
 

public void save(Myapp_Register  register) {
	  Session session= sessionFactory.openSession();
	  Transaction transaction= session.beginTransaction();
	  session.saveOrUpdate( register);
	  transaction.commit();
	  session.close();
	  
	 
}



public Myapp_Register getByEmailId(String email) {
	 Session session= sessionFactory.openSession();
	 String que = "from Myapp_Register where email = '"+email+"'";
	 Query query = session.createQuery(que);
     Myapp_Register entity =  (Myapp_Register) query.getSingleResult();
     System.out.println(entity);
     session.close();
	 return entity;
	 
 
	
	
}


       
}
