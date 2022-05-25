package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePerson {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
	   Person person=new Person();
	   person.setName("madhu");
	   person.setEmail("madhu@gmal.com");
	   person.setPhone(64747477479l);
	   
	   Pan pan=new Pan();
	   pan.setPanNumber(748999);
	   pan.setAddress("banglore layout");
	   
	   person.setPan(pan);
	   
	   
	    entityTransaction.begin();
	    entityManager.persist(person);
	    entityManager.persist(pan);
		entityTransaction.commit();

	}

}
