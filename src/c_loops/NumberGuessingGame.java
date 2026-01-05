package c_loops;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess;
        int num = 5;
        do {
            System.out.print("Enter the guess num :");
            guess = sc.nextInt();
        }while( guess  != num);
            System.out.println("your guess number is correct");


    }
}
