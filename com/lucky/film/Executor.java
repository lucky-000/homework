package com.lucky.film;


import com.lucky.film.coll.Serials;
import com.lucky.film.cinema.RealCinema;
import com.lucky.film.cinema.HomeCinema;


public class Executor {
	public static void main(String[] args) {
		System.out.println("Serials class");
		Serials serial1 = new Serials();
		serial1.setTitle("Game of Trones");
		serial1.setYear(2011);
		serial1.setNseason(8);
		serial1.setNseries(73);

		System.out.println("----------------------------------------");

		System.out.println("Abstract class Cinema");
		
		HomeCinema cinema = new HomeCinema();
		cinema.setTitle("3D");
		cinema.setAdress("cinema.com");
		cinema.addSerials(serial1);
		cinema.printFields();
		cinema.printSpectator();
		
		RealCinema cinema2 = new RealCinema();
		cinema2.printSpectator();
		cinema2.workingCinema();
		cinema2.workingCinema(false);
		cinema2.workingCinema(true);
		
		
		
		System.out.println("----------------------------------------");

		
		
	}
}
