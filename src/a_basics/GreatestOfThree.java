package a_basics;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("calculate the greatest number");
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is greater");
        }
        else if(b>c && b>a){
            System.out.println("B is greater");
        }
        else{
            System.out.println("C is greater");
        }
    }
}
