package com.lucky.film.collection;

public class Serials extends Film{
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
	public void setNseason(int nseason1) {
		nseason=nseason1;
	}
	public int getNseason() {
		return nseason;
	}
//	---------------------------------------
	
	public void setNseries(int nseries1) {
		nseries=nseries1;
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
	
}
