package e_classesAndObjects;

import java.util.Scanner;

public class MinimumTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to find minimum number");
        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number:");
        int num2 = sc.nextInt();
        MinimumTernary ternary = new MinimumTernary();
        int min = ternary.min(num1 , num2);
        System.out.println("Minimum number is : "+ min);

    }
    public  int min(int num1 , int num2){
        return num1 < num2 ? num1 : num2;

    }
}
