package com.lucky.film;



import java.io.File;
import com.lucky.film.cinema.RealCinema;
import com.lucky.film.coll.Real;
import com.lucky.film.exception.MyException;
import com.lucky.film.functional.Creator;
import com.lucky.film.utils.ReadingFromFile;
import com.lucky.film.utils.WriteReadProperties;
import com.lucky.film.coll.Movies;

public class Executor {
	public static void main(String[] args)  throws MyException{
		String separator = File.separator;
		String pathFirst = "C:" + separator + "Users"+ separator + "myrch"+ separator + "eclipse-workspace"+ separator +"homework"+ separator + "src" + separator + "com" + separator + "lucky" + separator + "film"  + separator + "file.txt";
		String pathSecond = "C:" + separator + "Users"+ separator + "myrch"+ separator + "eclipse-workspace"+ separator +"homework"+ separator +separator + "src" + separator + "com" + separator + "lucky" + separator + "film"  + separator + "file.properties";
		
		WriteReadProperties properties =new WriteReadProperties();
		properties.setProperties(pathSecond, "login", "lucky");
		properties.setPropertiesPlus(pathSecond, "pass", "pas123");
		String printLogin = properties.getProperties(pathSecond, "login");
		System.out.println("Login: "+ printLogin);
		
		String printPass = properties.getProperties(pathSecond, "pass");
		System.out.println("Pass: " + printPass);
		System.out.println("----------------------------------------");
		ReadingFromFile readFile = new ReadingFromFile();
		System.out.println(readFile.readFromFile(pathFirst));
		System.out.println("----------------------------------------");
		Creator creator = new Creator();
		creator.addNameYear(pathFirst);
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
