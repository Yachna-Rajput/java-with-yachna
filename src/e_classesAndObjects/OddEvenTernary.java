package e_classesAndObjects;

import java.util.Scanner;

public class OddEvenTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to odd or even");
        System.out.println("Enter your first number: ");
        int num = sc.nextInt();
        String result = num % 2 == 0 ? "Even" : "Odd" ;
        System.out.println("Number is "+ result);
    }
}
