
/*
 * Class: CMSC203 
 * Instructor:Grinberg
 * Description: A program that asks a user for a movie title, rating, and tickets sold and asks again by user choice. 
 * Due: 9/20/2021
 * Platform/compiler:Ecilpse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: _Hendrick Nguyen__
*/

import java.util.Scanner;					

public class MovieDriver 
{
	
	public static void main (String[] args) 
	{
		
	

		Scanner scanner = new Scanner (System.in);		// create scanner object :scanner
		char loop = 'y';								//create char object for new user movie input



	
		while (loop == 'y')							// begins while loop for char 
		{
			Movie m = new Movie();					// call to method "Movie"
		
			System.out.println ("Enter the name of a movie.");		//display movie input
			String title = scanner.nextLine();						//scanner reads movie input
			m.setTitle(title);										//sets movie input to title in Title method
		
			System.out.println ("Enter the rating of the movie");	//ask user for rating input
			String rating = scanner.next();							//scanner reads rating input	
			m.setRating(rating);									//set rating input to rating string in Rating method
	
	
			System.out.println("Enter the number of tickets sold for this movie.");	//ask user for tickets sold
			int tickets = scanner.nextInt();										//scanner reads integer tickets
			m.setSoldTickets(tickets);												//set inputed tickets to ticket in SoldTickets method
		
			System.out.println(m.toString());										//call to toString to display user inputs for title tickets and rating
			
			System.out.println("Do you want to enter another movie? (Y/N)");		//ask user to enter new movie
			loop = scanner.next().charAt(0);										//scanner read char loop 
			scanner.nextLine();														//scanner reads next line as while loop reiterates
		}
	System.out.println("Goodbye!");
	}
}
