package com.lucky.film.cinema;

public class RealCinema extends Cinema {
	private String adress;
	private String title;

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
	
	public void printFields(){
		System.out.println("Title cinema = " + title);
	       System.out.println("URL Online Cinema = " + adress);

	   }
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub

	}

}
