package com.lucky.film;


import java.util.Scanner;
import com.lucky.film.coll.Serials;
import com.lucky.film.cinema.RealCinema;
import com.lucky.film.cinema.HomeCinema;
import com.lucky.film.coll.Film;
import com.lucky.film.coll.Real;


public class Executor {
	public static void main(String[] args) {

		

			System.out.println("Print number");
			System.out.println("1.Add Serial");
			System.out.println("2.Add Film");
			System.out.println("3.Exit");
			Scanner scan = new Scanner(System.in);
			
			int b = scan.nextInt();
			switch(b)
			{
			
			case 1:
				System.out.println("Enter name serial");
				Creator cr = new Creator();
				cr.addNameYear();
				Film serial = new Serials(cr.name1,cr.year1);
				HomeCinema cinema = new HomeCinema();
				cinema.setTitle("3D");
				cinema.setAdress("cinema.com");
				cinema.addFilm(serial);
				cinema.printFields();

				break;
			case 2:
				System.out.println("Enter start year serial");
				Creator cr1 = new Creator();
				cr1.addNameYear();
				Film movie = new Real(cr1.name1,cr1.year1);
				HomeCinema cinema1 = new HomeCinema();
				cinema1.setTitle("3D");
				cinema1.setAdress("cinema.com");
				cinema1.addFilm(movie);
				cinema1.printFields();
				
				break;
			default:
				
				break;
				
			}
		
		
		RealCinema cinema2 = new RealCinema();
//		cinema2.printSpectator();
		cinema2.workingCinema();
		cinema2.workingCinema(false);
		cinema2.workingCinema(true);
	
		
		
		
		System.out.println("----------------------------------------");

		
		
	}
}
