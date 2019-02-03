package com.axelor.mapping.oneTomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Actors {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String actorName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Actor_Ids")
	List<Films> filmList;

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

	public List<Films> getFilmList() {
		return filmList;
	}

	public void setFilmList(List<Films> filmList) {
		this.filmList = filmList;
	}
	
	
	
	
}
