import java.util.Scanner;

import java.lang.Math;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //scans the input of user
        int mysteryNum = (int) (10 * Math.random()); //creates an int that generates a random num btw 0-10
        int numGuesses = 0; //created int var called numGuesses for how many guesses user made, init is 0
        int i, numGuessed; //created int i for the num guessed by user input

        System.out.println("Guess a number between 1 and 10!"); //init output by system to prompt user
        for (i = 0; i < 10; i++) { //for each num guessed by user 0-10?
            numGuessed = sc.nextInt(); //the numGuessed is the input by user scanned in by sc object
            if (mysteryNum == numGuessed) { //if the num is guessed correctly, print "Correct!" and stop
                System.out.println("Correct!");
                numGuesses++; //increased the guess count by 1 each time scanner takes input from user
                break;
            } else if (mysteryNum > numGuessed) {
                System.out.println("Too small, guess again.");
                numGuesses++;
            } else if (mysteryNum < numGuessed) {
                System.out.println("Too large, guess again.");
                numGuesses++;
            }
            if (numGuesses == 9) { //gives user 9 guesses
                System.out.println("No more guesses, number was " + mysteryNum + ".");
            }
        }
        System.out.println("That took " + numGuesses + " tries!"); //prints out the number of tries user took
        
    }
}
