package c_loops;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int power = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, power);
            num /= 10;
        }
        if (sum == original) {
            System.out.println("Your number is an Armstrong number");
        } else {
            System.out.println("Your number is not armstrong number");
        }
    }
}