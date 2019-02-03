package com.axelor.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Student student=new Student(3, "Tushar Devkar");
    	
    	EntityManagerFactory  managerFactory=Persistence.createEntityManagerFactory("jpapractice");
    	
    	
    	EntityManager manager=managerFactory.createEntityManager();
    	
    	manager.getTransaction().begin();
    	
    	manager.persist(student);
    	
    	manager.getTransaction().commit();
    }
}
