package com.axelor.embeddable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppEmploye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("jpapractice");
		EntityManager manager=factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		FullName fullName=new FullName("Abhinav", "Shankar", "Devkar");
		FullName fullName1=new FullName("GhanShayam", "Shankar", "Devkar");
		List<FullName> fullNameList=new ArrayList<FullName>();
		fullNameList.add(fullName);
		fullNameList.add(fullName1);
		fullNameList.add(fullName1);
		
		Employee employee=new Employee();
		employee.setEid(4);
		employee.setEmployeeDesignation("CEO");
		
		employee.setFullName(fullNameList);
		
		manager.persist(employee);
		manager.getTransaction().commit();
		

	}

}
