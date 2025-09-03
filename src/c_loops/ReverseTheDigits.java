package c_loops;

import java.util.Scanner;

public class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Reverse the digit ");
        System.out.print("Enter a number");
        int num = sc.nextInt();
        int reverse = 0;
        while(num>0) {
            int digit = num % 10;
            reverse = reverse* 10 + digit;
            num /= 10;
        }
        System.out.println("The reverse number is: " + reverse);
    }
}

