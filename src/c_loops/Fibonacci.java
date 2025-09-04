package c_loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the fibonacci series");
        System.out.print("Enter the num  up to which series has to be printed ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("0");
            if(num==0){
                System.out.println("1");
            }
        }
        int first = 0, second = 1;
        System.out.print(first + " ");   // pehle 0 print kar diya
            System.out.print(second + " ");  // phir 1 print kar diya

        while (first + second <= num) {
            int third = first + second;
            System.out.print(third+ " ");
            first = second;
            second = third;
        }
    }
}
