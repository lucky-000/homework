package com.lucky.film;



import java.io.File;

import com.lucky.film.exception.MyException;
import com.lucky.film.functional.Creator;


public class Executor {
	public static void main(String[] args)  throws MyException{
		String separator = File.separator;
		String pathFirst = "C:" + separator + "Users"+ separator + "myrch"+ separator + "eclipse-workspace"+ separator +"homework"+ separator + "src" + separator + "com" + separator + "lucky" + separator + "film"  + separator + "file.txt";
		String pathSecond = "C:" + separator + "Users"+ separator + "myrch"+ separator + "eclipse-workspace"+ separator +"homework"+ separator +separator + "src" + separator + "com" + separator + "lucky" + separator + "film"  + separator + "file.properties";
		

		System.out.println("----------------------------------------");
		Creator creator = new Creator();
		creator.addNameYear(pathFirst,pathSecond);
		System.out.println("----------------------------------------");
		
	}
}
