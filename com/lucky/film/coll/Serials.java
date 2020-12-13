package com.lucky.film.coll;

public class Serials implements Film{
	private String title;
	private int year;
	private int nseason;
	private int nseries;
	
	public Serials() {
		
	}
	
	public Serials(String title1, int year1) {
		title=title1;
		year=year1;
	}
//--------------------------------------------	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
//-----------------------------------------	
	public void setYear(int year) {
		this.year=year;
	}
	public int getYear() {
		return year;
	}
//------------------------------------------	
	public void setNseason(int nseason) {
		this.nseason=nseason;
	}
	public int getNseason() {
		return nseason;
	}
//	---------------------------------------
	
	public void setNseries(int nseries) {
		this.nseries=nseries;
	}
	public int getNseries() {
		return nseries;
	}
//---------------------------------------------
	   public void printFields(){
	       System.out.println("Film title = "+title);
	       System.out.println("Premiere date = "+year);
	       System.out.println("Number of season = "+nseason);
	       System.out.println("Number of series = "+nseries);
	   }

	@Override
	public void printTitle() {
		System.out.println("Film title = "+title);
		
	}
	
}
