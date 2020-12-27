package com.lucky.film;


import com.lucky.film.coll.Serials;
import com.lucky.film.cinema.RealCinema;
import com.lucky.film.cinema.HomeCinema;
import com.lucky.film.coll.Film;
import com.lucky.film.coll.Real;


public class Executor {
	public static void main(String[] args) {
//		System.out.println("Serials class");
//		Serials serial1 = new Serials();
//		serial1.setTitle("Game of Trones");
//		serial1.setYear(2011);
//		serial1.setNseason(8);
//		serial1.setNseries(73);
		
		Film serial = new Serials("Game of Trones",2011);
		Film movie = new Real("Imitation Game",2014);

		System.out.println("----------------------------------------");

		
		HomeCinema cinema = new HomeCinema();
		cinema.setTitle("3D");
		cinema.setAdress("cinema.com");
		cinema.addFilm(serial);
		cinema.printFields();
		
		cinema.addFilm(movie);
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
