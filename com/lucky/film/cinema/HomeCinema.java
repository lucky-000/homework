package com.lucky.film.cinema;

import com.lucky.film.coll.Film;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class HomeCinema extends Cinema {
	private String adress;
	

	List<Film> content;
	Set<Film> uniqContent;
	
	public HomeCinema() {
		content = new ArrayList<Film>();
		uniqContent = new HashSet<Film>();
	}

	public HomeCinema(String title) {
		super(title);
		content = new ArrayList<Film>();
		uniqContent = new HashSet<Film>();

	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAdress() {
		return adress;
	}
	public void addFilm(Film film) {
		content.add(film);

	}
	public void addUniqFilm(Film film) {
		uniqContent.add(film);

	}
	public void printSpectator() {
		System.out.println("family");
	}
	
	public final void printFields(){
		System.out.println("Title cinema = " + getTitle());
	       System.out.println("URL Online Cinema = " + adress);
	       
	       
	   }
	public void delFilm(int k) {
		content.remove(k);
	}
	
	public void copyListToSet() {
		uniqContent.addAll(content);
	}
	@Override
	public void printInfo() {
		int a=0;
		for (Film film :content) {
			System.out.println(a + "." + film.toString());
			a++;
		}
	}
	public void printInfoHash() {
		
		for (Film film :uniqContent) {
			System.out.println( film.toString());
			
		}
	}
}
