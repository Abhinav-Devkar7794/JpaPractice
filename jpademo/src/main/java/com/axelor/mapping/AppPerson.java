package com.axelor.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdharCard adharCard=new AdharCard();
		adharCard.setAdharCardNo(859647);
		
		Person person=new Person();
		person.setPersonName("Abhinav Devkar");
		person.setAdharCard(adharCard);

        EntityManagerFactory  managerFactory=Persistence.createEntityManagerFactory("jpapractice");
    	
    	EntityManager manager=managerFactory.createEntityManager();
    	
    	manager.getTransaction().begin();
    	
    	manager.persist(person);
    	
    	manager.getTransaction().commit();
		
		
	}
	

}
