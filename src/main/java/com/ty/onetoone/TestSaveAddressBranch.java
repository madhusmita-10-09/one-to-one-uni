package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveAddressBranch {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branch = new Branch();
		branch.setName("dermatology");
		branch.setState("bihar");
		branch.setCountry("india");
		branch.setPhone(918032390l);

		Address address = new Address();
		address.setName("basavanagudi");
		address.setState("karanataka");
		address.setPhone(98864646l);

		branch.setAddress(address);
		entityTransaction.begin();
		entityManager.persist(branch);
		entityManager.persist(address);
		entityTransaction.commit();

	}

}
