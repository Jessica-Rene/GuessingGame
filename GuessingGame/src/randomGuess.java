
/*
 * Create a variable for user to guess a number
 * Create a variable for keeping track of points
 * 
 * Ask the user if they'd like to guess a number between 1 - 100?
 * 
 * Create if/else statement to keep track of points
 */

import java.util.Scanner;

public class randomGuess {

	public static void main(String[] args) {

		int userGuess;
		int points = 0;
		int randNum = (int) (Math.random()*10) + 1;
		String guessAgain;

		Scanner scnr = new Scanner(System.in);
		System.out.println("Would you like to guess a number (yes or no)?");
		guessAgain = scnr.next();		

		while (!guessAgain.equals("no")) {
			System.out.println("Awesome, guess a number between 1 - 10");
			userGuess = scnr.nextInt();

			if (userGuess == randNum) {
				System.out.println("Impressive, you guessed the correct number!");
				points++;
				System.out.println("You now have " + points + " points!");
			}
			else {
				System.out.println("Nice try, would you like to guess again (yes or no)?");
				guessAgain = scnr.next();
			}			
		}
		System.out.println("Thanks for playing, Goodbye!");
		scnr.close();

	}

}