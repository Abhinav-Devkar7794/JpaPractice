package com.axelor.embeddable;

import javax.persistence.Embeddable;

@Embeddable
public class Film {

	String language;
	int totalFilm;
	int hitFilm;
	
	
	
	public Film(String language, int totalFilm, int hitFilm) {
		super();
		this.language = language;
		this.totalFilm = totalFilm;
		this.hitFilm = hitFilm;
	}



	public Film() {
		super();
	}
	
	
	
}
