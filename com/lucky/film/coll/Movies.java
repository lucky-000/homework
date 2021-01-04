package com.lucky.film.coll;

public class Movies implements Film {

	private String title;
	private int year;
	
	public Movies() {
		
	}
	public Movies(String title, int year) {
		this.title=title;
		this.year=year;
	}
	
	@Override
	public void printTitle() {
		// TODO Auto-generated method stub
		
	}
	public void setTitle(String title) {
		this.title=title;
	}

	public void setYear(int year) {
		this.year=year;
	}
	@Override
	public String getTitle() {
		return title;
	}
	@Override
	public int getYear() {
		return year;
	}


}
