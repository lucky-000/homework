package com.lucky.film;


import com.lucky.film.coll.*;
import com.lucky.film.cinema.*;

public class Executor {
	public static void main(String[] args) {
		System.out.println("Serials class");
		Serials serial1 = new Serials();
		serial1.setTitle("Game of Trones");
		serial1.setYear(2011);
		serial1.setNseason(8);
		serial1.setNseries(73);
		serial1.printFields();
		serial1.printTitle();


		
		System.out.println("----------------------------------------");

		System.out.println("Abstract class Cinema");
		HomeCinema cinema = new HomeCinema();
		cinema.setTitle("3D");
		cinema.setAdress("cinema.com");
		cinema.printFields();
		
	}
}
