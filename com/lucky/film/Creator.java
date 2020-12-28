package com.lucky.film;

import java.util.Scanner;


public final class Creator {
	public boolean a=true;
	public int year1;
	public String name1;
	public Creator(){
		
	}
	
	public void addNameYear() {
		do {
			System.out.println("Print number");
			System.out.println("1.Enter Title");
			System.out.println("2.Add Year");
			System.out.println("3.Close");
			Scanner scan = new Scanner(System.in);
			int b = scan.nextInt();
			switch(b)
			{
			
			case 1:
				System.out.println("Enter name serial");
				Scanner name = new Scanner(System.in);
				name1 = name.nextLine();
				
				
				break;
			case 2:
				System.out.println("Enter start year serial");
				Scanner year = new Scanner(System.in);
				 year1= year.nextInt();
				break;
			default:
				a=false;
				break;
				
			}
			
			
		} while(a);
		

	}
	
	
}
