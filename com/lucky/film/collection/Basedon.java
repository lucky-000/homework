package com.lucky.film.collection;

public class Basedon extends Unreal{
	private String title;
	private int year;
	private String event;
	
	public Basedon() {
		
	}
	
	public Basedon(String title1, int year1) {
		title=title1;
		year=year1;
	}
//--------------------------------------------	
	public void setTitle(String title1) {
		title=title1;
	}
	public String getTitle() {
		return title;
	}
//-----------------------------------------	
	public void setYear(int year1) {
		year=year1;
	}
	public int getYear() {
		return year;
	}
//------------------------------------------	
	public void setEvent(String event1) {
		event=event1;
	}
	public String getEvent() {
		return event;
	}
	
//---------------------------------------------
	   public void printFields(){
	       System.out.println("Film title = "+title);
	       System.out.println("Premiere date = "+year);
	       System.out.println("Based on "+event);

	   }
}
