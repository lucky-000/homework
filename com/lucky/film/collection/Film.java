package com.lucky.film.collection;

public class Film {
	private String title;
	private int year;
	private float point;
	
	public Film() {
		title="";
		year=0;
	}
	public Film(String title1, int year1) {
		title=title1;
		year=year1;
	}
	public void setPoint(float point1) {
		point=point1;
	}
	public float getPoint() {
		return point;
	}
	
	   public void printFields(){
	       System.out.println("Film title = "+title);
	       System.out.println("Premiere date = "+year);
	       System.out.println("Point = "+point);
	   }
}
