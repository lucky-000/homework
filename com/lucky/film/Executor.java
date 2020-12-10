package com.lucky.film;

import com.lucky.film.collection.*;

public class Executor {
	public static void main(String[] args) {
		System.out.println("Serials class");
		Serials serial1 = new Serials();
		serial1.setTitle("Game of Trones");
		serial1.setYear(2011);
		serial1.setNseason(8);
		serial1.setNseries(73);
		serial1.printFields();
		
		
//--------------------------------------------		
		System.out.println("----------------------------------------");
		System.out.println("Real class");
		Real real1 = new Real();
		real1.setTitle("Imitation Game");
		real1.setYear(2014);
		real1.setEvent("Biographical film about Alan Turing");
		real1.printFields();
	
	
	System.out.println("----------------------------------------");
	
	System.out.println("Basedon class");
	Basedon bs1 = new Basedon();
	bs1.setTitle("Captan America");
	bs1.setYear(2011);
	bs1.setEvent("comics");
	bs1.printFields();

	}
}

