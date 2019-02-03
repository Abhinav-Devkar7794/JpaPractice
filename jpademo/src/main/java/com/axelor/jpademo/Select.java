package com.axelor.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

    	EntityManagerFactory  managerFactory=Persistence.createEntityManagerFactory("jpapractice");
    	
    	
    	EntityManager manager=managerFactory.createEntityManager();
    	
    	//manager.getTransaction().begin();
    	
    	Student s=manager.find(Student.class, 1);
    	System.out.println("Id is : "+s.getId()+" Student Name : "+s.getStudentName());
    	
    	//manager.getTransaction().commit();

	}

}
