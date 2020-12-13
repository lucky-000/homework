package com.lucky.film.cinema;

public class HomeCinema extends Cinema {
	private String adress;
//	private String title;


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
	public void printFields(){
		System.out.println("Title cinema = " + getTitle());
	       System.out.println("URL Online Cinema = " + adress);

	   }
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub

	}

}
