package com.lucky.film;

import java.util.Scanner;

import com.lucky.film.cinema.HomeCinema;
import com.lucky.film.coll.Film;
import com.lucky.film.coll.Real;
import com.lucky.film.coll.Serials;



public final class Creator {
	private boolean a=true;
	private  int year1;
	private  String name1;
	private Scanner name, scan, year;
	
	public  Creator(){
		
	}
	
	public void addNameYear() {
		HomeCinema cinema = new HomeCinema();
		Film serial = new Serials();
		Film movie = new Real();
		name = new Scanner(System.in);
		year = new Scanner(System.in);
		do {
			System.out.println("Print number");
			System.out.println("1.Add Serial Title and year");
			System.out.println("2.Add Film Title and year");
			System.out.println("3.Delete film or serial");
			System.out.println("4.Copy ArrayList in HashSet");
			System.out.println("5.Print ArrayList");
			scan = new Scanner(System.in);
			int b = scan.nextInt();
			switch(b)
			{
			
			case 1:
				System.out.println("Enter name serial");
				name = new Scanner(System.in);
				name1 = name.nextLine();
				System.out.println("Enter start year serial");
				year = new Scanner(System.in);
				year1= year.nextInt();
				serial = new Serials(name1,year1);
				cinema.addFilm(serial);
				break;
			case 2:
				System.out.println("Enter name film");
				name = new Scanner(System.in);
				name1 = name.nextLine();
				System.out.println("Enter start year film");
				year = new Scanner(System.in);
				year1= year.nextInt();
				movie = new Real(name1,year1);
				cinema.addFilm(movie);
				break;
			case 3:
				cinema.printInfo();
				System.out.println("Print number del");
				Scanner ind = new Scanner(System.in);
				int ind1= ind.nextInt();
				cinema.delFilm(ind1);
				cinema.printInfo();
				break;
			case 4:
				cinema.printInfo();
				cinema.copyListToSet();
				cinema.printInfoHash();
				break;
			case 5:
				cinema.printInfo();

				break;
			default:
				a=false;
				break;
				
			}
			
			
		} while(a);
		
		
	}
	
	
	
}
