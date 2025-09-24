package Projects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {


    public static void PlayingGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) +1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Can you guess it?");

        do{
        System.out.println("Enter your guess : ");
        guess = sc.nextInt();
        attempts++;

            if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts.");
            }
        }while(guess!=numberToGuess);

        }

    public static void main(String[] args) {
        PlayingGame();
    }


    }

