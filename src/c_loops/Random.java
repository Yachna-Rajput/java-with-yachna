package c_loops;

import java.util.Scanner;

public class Random {
    int random;

    public Random() {
        random = (int)Math.ceil(Math.random() * 100);

    }

    public int guessing(int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int guessNumber;
        int result;
        do {
            System.out.print("Enter your guess number : ");
            guessNumber = sc.nextInt();
            result = random.guessing(guessNumber);
            if( result== 0){
                System.out.println("You guess number is right");

            } else if (result< 0) {
                System.out.println("Guess the high Number");
            }else {
                System.out.println("Guess the low number");
            }

        } while (result != 0);
    }
}