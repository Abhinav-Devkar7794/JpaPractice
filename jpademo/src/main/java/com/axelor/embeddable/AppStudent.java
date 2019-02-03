package com.axelor.embeddable;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppStudent {

	public static void main(String[] args) {
	
		Address address=new Address("Gandhi Kutir", "Pune");
		Address address1=new Address("Kalyan Kutir", "Pune");
		
		Set<Address> addressSet=new HashSet<Address>();
		addressSet.add(address1);
		addressSet.add(address);
		addressSet.add(address);
		
		
		
		
		Faculty student=new Faculty();
		student.setStudentName("Sunny Devkar");
		student.setAddressSet(addressSet);
		
		
		
		
		
		
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("jpapractice");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		
		manager.persist(student);
		manager.getTransaction().commit();
		
		
		
		
		
		

	}

}
