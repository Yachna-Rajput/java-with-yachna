package c_loops;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("check wheather the number is palindrome or not");
        System.out.println("Enter your Number");
        int num = sc.nextInt();

        // Reverse the digit
        int originalnum = num;
        int Reverse = 0;

        while (num!=0) {
            int digit = num % 10;
            Reverse = Reverse * 10 + digit;
            num = num / 10;
        }

        if (originalnum == Reverse) {
            System.out.println(originalnum + " is a palindrome number");
        } else {
            System.out.println(originalnum + " is not a palindrome number");
        }
    }
}
