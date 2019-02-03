package com.axelor.mapping.oneTomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppActorFilm {

	public static void main(String[] args) {
		
		Films Films=new Films();
		Films.setFilmName("Raees");
		Films Films1=new Films();
		Films1.setFilmName("Don3");
		
		List<Films> FilmsList=new ArrayList<Films>();
		FilmsList.add(Films1);
		FilmsList.add(Films);
		
		
		Actors actor=new Actors();
		actor.setActorName("Shahrukh Khan");
		actor.setFilmList(FilmsList);
		
		 EntityManagerFactory  managerFactory=Persistence.createEntityManagerFactory("jpapractice");
	    	
	    	EntityManager manager=managerFactory.createEntityManager();
	    	
	    	manager.getTransaction().begin();
	    	
	    	manager.persist(actor);
	    	
	    	manager.getTransaction().commit();
			

	}

}
