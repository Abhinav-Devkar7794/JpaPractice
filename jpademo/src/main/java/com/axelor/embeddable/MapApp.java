package com.axelor.embeddable;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Film film=new Film("Hindi",78, 65);
		Film film1=new Film("Marathi",15, 15);
		
		Map<Integer , Film> filmMap=new HashMap<Integer, Film>();
		filmMap.put(1, film);
		filmMap.put(2, film1);
		
		
		Actor actor=new Actor();
		actor.setActorName("Shahrukh Khan");
		actor.setFilmMap(filmMap);
		
		
	
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("jpapractice");
		EntityManager manager=managerFactory.createEntityManager();
		
		manager.getTransaction().begin();
		
		manager.persist(actor);
		
		manager.getTransaction().commit();
		
		
		
		
	}

}
