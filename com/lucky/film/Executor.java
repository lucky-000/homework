package com.lucky.film;



import com.lucky.film.cinema.RealCinema;
import com.lucky.film.coll.Real;
import com.lucky.film.coll.Movies;
public class Executor {
	public static void main(String[] args) {


		Creator cr = new Creator();
		cr.addNameYear();
		

		System.out.println("----------------------------------------");
		RealCinema cinema = new RealCinema();
		Movies movie1 = new Real("War",2015);
		Movies movie2 = new Real("Imitation Game",2012);
		cinema.addMovies(movie1);
		cinema.addMovies(movie2);
		cinema.addMovies(movie2);
		cinema.addMovies(movie1);
		cinema.addMovies(movie2);
		cinema.addMovies(movie1);
		cinema.printInfo();
		
		
		
		
		
		
	}
}
