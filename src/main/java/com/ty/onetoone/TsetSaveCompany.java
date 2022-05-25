package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TsetSaveCompany {

	public static void main(String[] args) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
	   Company company=new Company();
	   company.setName("TCS");
	   company.setPhone(8469646l);
	   company.setWeb("ggsgsgsg");
	   
	   GST gst=new GST();
	   gst.setGstnumber(72999);
	   gst.setState("odisha");
	   gst.setCountry("India");
	   
	   gst.setCompany(company);
	   
	   
	    entityTransaction.begin();
	    entityManager.persist(company);
	    entityManager.persist(gst);
		entityTransaction.commit();
		
	}

}
