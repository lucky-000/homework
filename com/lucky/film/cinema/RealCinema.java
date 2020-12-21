package com.lucky.film.cinema;

import com.lucky.film.coll.Movies;

public class RealCinema extends Cinema {
	private String adress;
	private String title;
	
	public Movies rolling;
	
	public RealCinema() {

	}

	public RealCinema(String title) {
		super(title);

	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}

	public String getAdress() {
		return adress;
	}
	public void printSpectator() {
		System.out.println("_____________");
		System.out.println("Ñinemagoers ");
		System.out.println("_____________");
	}
	public void workingCinema() {
		System.out.println("The cinema is working");
	}
	
	public void workingCinema(boolean isWorking) {
		if (isWorking) {
			System.out.println("The cinema is open from 9:00 to 23:00");
		}else {
			System.out.println("The cinema is close from 23:00 to 9:00");
		}
		
	}
	
	
	public Movies addRolling(Movies movie) {
		this.rolling = movie;
		return this.rolling;
	}
	
	public void printFields(){
		System.out.println("Title cinema = " + title);
	       System.out.println("URL Online Cinema = " + adress);
//	       System.out.println( this.rolling.);

	   }
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub

	}

}
