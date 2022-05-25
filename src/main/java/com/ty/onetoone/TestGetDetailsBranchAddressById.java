package com.ty.onetoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetDetailsBranchAddressById {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Branch branch=entityManager.find(Branch.class,2);
		if(branch!=null)
		{
		Address address=branch.getAddress();
		
		System.out.println("------------------------------");
		System.out.println("Branch name is : "+branch.getName());
		System.out.println("Branch state  is : "+branch.getState());
		System.out.println("Branch country is : "+branch.getCountry());
		System.out.println("Branch phone number is: "+branch.getPhone());
		
		
		System.out.println("-----------------------------");
		
		
			System.out.println("Address  id is: "+address.getName());
			System.out.println("State  is :"+address.getState());
			System.out.println("phone number is: "+address.getPhone());
			
			System.out.println("-----------------------------------");
		
	}
		else
		{
			System.out.println("Branch  doesnot  exist");
		}
	}
		

	

}
