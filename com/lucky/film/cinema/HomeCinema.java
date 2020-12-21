package com.lucky.film.cinema;

import com.lucky.film.coll.Serials;

public class HomeCinema extends Cinema {
	private String adress;
	
	private Serials content;
	

	public HomeCinema() {

	}

	public HomeCinema(String title) {
		super(title);

	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAdress() {
		return adress;
	}
	public Serials addSerials(Serials serial) {
		this.content=serial;
		return this.content;
	}
	public void printSpectator() {
		System.out.println("family");
	}
	
	public void printFields(){
		System.out.println("Title cinema = " + getTitle());
	       System.out.println("URL Online Cinema = " + adress);
	       System.out.println(this.content.getTitle());
	       System.out.println(this.content.getNseason());
	       System.out.println(this.content.getNseries());
	   }
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub

	}

}
