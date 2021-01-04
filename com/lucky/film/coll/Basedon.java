package com.lucky.film.coll;

public class Basedon extends Unreal{
	
	private String event;
	
	public Basedon() {
		
	}
	
	public Basedon(String title, int year) {
	super(title,year);
	}
//--------------------------------------------	
	
//------------------------------------------	
	public void setEvent(String event1) {
		event=event1;
	}
	public String getEvent() {
		return event;
	}
	
//---------------------------------------------
	   public void printFields(){
	       System.out.println("Film title = "+this.getTitle());
	       System.out.println("Premiere date = "+this.getYear());
	       System.out.println("Based on "+event);

	   }
}
