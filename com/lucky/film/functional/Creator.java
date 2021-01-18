package com.lucky.film.functional;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.lucky.film.cinema.HomeCinema;
import com.lucky.film.coll.Film;
import com.lucky.film.coll.Real;
import com.lucky.film.coll.Serials;
import com.lucky.film.exception.MyException;


public final class Creator {
	
	private  int year;
	private  String name;
	HomeCinema cinema = new HomeCinema();
	
	public  Creator(){
		
	}
	
	public void addNameYear (String path) throws MyException {
		boolean menu=true;
		Film serial = new Serials();
		Film movie = new Real();
		int nowYear = Calendar.getInstance().get(Calendar.YEAR);
		
		
		do {
			
			System.out.println("Print number");
			System.out.println("1.Add Serial Title and year");
			System.out.println("2.Add Film Title and year");
			System.out.println("3.Delete film or serial");
			System.out.println("4.Print ArrayList");
			Scanner scaner = new Scanner(System.in);
			Scanner scanner = new Scanner(System.in);
			int choice = scaner.nextInt();
			switch(choice)
			{
			
			case 1:
				
				System.out.println("Enter name film, start year film ");	
				name = scanner.nextLine();
				try {
					year= scanner.nextInt();
					if(year!=0) {
					serial = new Serials(name,year);
					cinema.addFilm(serial);}				
				} catch(InputMismatchException e)
				{
					System.err.println( "error: ");
					
				} 
				break;
			case 2:
				System.out.println("Enter name film, start year film ");
				name = scanner.nextLine();
				try {
					year= scanner.nextInt();				
				} catch (InputMismatchException e) {
					System.out.println(e.getMessage());
				}
				if((year>0)&(year<nowYear)&name!="") {
					movie = new Real(name,year);
					cinema.addFilm(movie);
					}else {
						throw new MyException();
					}
				
				break;
			case 3:
				cinema.printInfo();
				System.out.println("Print number del");
				Scanner index = new Scanner(System.in);
				int indexFilm= index.nextInt();
				cinema.delFilm(indexFilm);
				cinema.printInfo();
				break;
			case 4:
				cinema.printInfo();
				break;

			default:
				menu=false;
				break;
				
			}	
		} while(menu);


		cinema.writeFilmToFile(path);
	}
	
	

	
	
	
}
