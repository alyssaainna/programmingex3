/**
 * 
 */

/**
 * @author amanlapi
 *
 */

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args){
		int randomnumber = (int)(Math.random()*10001);
		int max = 10000, min=1, tries=1;
			
		Scanner input = new Scanner(System.in);
		System.out.println(" Guess a number between 1-10,000 ");
		
	//	int guess = -1?;
		while (true) {
		System.out.print(" Enter your guess between "+ min+ " and " + max + ":");
		//guess = input.nextInt()?;
		int guess = input.nextInt();
		
		
		 if ( guess > randomnumber && guess<=10000) {
			System.out.println( guess + " is too high "); max=guess;}
		else if ( guess < randomnumber && guess >=1) {
			System.out.println( guess + " is too low "); min=guess; }
		else if (guess == randomnumber) {
				System.out.println (" Congrats the number is " + randomnumber + " It took you " + tries + " attempts ");
				break;}
		 //increment 
		tries++;		
		}}}	
