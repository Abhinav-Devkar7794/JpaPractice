package com.axelor.embeddable;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actor {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String actorName;
	
	@ElementCollection
	Map<Integer,Film> filmMap=new HashMap<Integer, Film>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public Map<Integer, Film> getFilmMap() {
		return filmMap;
	}

	public void setFilmMap(Map<Integer, Film> filmMap) {
		this.filmMap = filmMap;
	}
	
	
	
	
	
	
}
