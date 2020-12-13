package com.lucky.film.cinema;

public abstract class Cinema {
	private String title;
	public Cinema() {
		title="";
	}
	public Cinema(String title) {
		this.title=title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void printFields(){
	       System.out.println("Cinema Title = " + title);

	   }
	
	public abstract void printInfo();
}
