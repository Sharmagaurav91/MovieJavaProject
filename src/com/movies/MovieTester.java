package com.movies;

import java.util.Scanner;

public class MovieTester {

	public static void main(String[] args) {
		
		

		// Creates a Movie array of size three.
		// Here you are declaring your array of movies of size 3
		Movie[] movies = new Movie[3];
		String Title;
		int Year;
		Double Runtime;
		
		// ask user to enter movie name three times and simultaneously populate movie object and store them in an array.
		for (int i=0; i < movies.length; i++) {
			
		   Scanner input = new Scanner(System.in);
		  System.out.println("Please enter the title of Movie " +(i+1)+" :");
		  Title = input.nextLine();
		  System.out.println("Please enter the year of Movie " + (i+1)+" :");
		  Year = input.nextInt();
		  System.out.println("Please enter the runtime of Movie " +(i+1)+" :");
		  Runtime= input.nextDouble();
		  movies[i] = new Movie(Title,Year,Runtime);
		}
	
	
	
		// Loop will execute 3 times and just print out the movie names that we populated.
	
		System.out.println("##############################################");
		System.out.println("Your Movies Details are below:");
		System.out.println("-------------------------------");
		for (int x = 0; x < movies.length; x += 1){ 
		    System.out.println("Movie " + (x+1) + " is: " + movies[x].getTitle());
		    System.out.println("Movie " + (x+1) + "'s Year is: " + movies[x].getYear());
		    System.out.println("Movie " + (x+1) + "'s Runtime is: " + movies[x].getRunTime());
		    
		}

	}

}
