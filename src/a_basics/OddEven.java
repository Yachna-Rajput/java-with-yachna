package a_basics;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("calculate the number is odd or Even");
        System.out.println("Enter the num");
        int num = sc.nextInt();

        if(num % 2 ==0) {
            System.out.println("Your number is even");
        }
        else{
            System.out.println("The number is odd");
        }

    }
}
